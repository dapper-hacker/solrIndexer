/*
Author:Vinayak Agrawal
vinayakagrawal88@gmail.com
*/
package SolrIndexer;
import org.apache.hadoop.metrics2.util.MetricsCache.Record;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;

import reader.RecordGen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class MyIndexer {

// Class to Index data into Solr
	  public void Indexing (List<RecordGen> recordlist)throws IOException, SolrServerException {
	    HttpSolrServer server = new HttpSolrServer("http://localhost:8983/solr/test_core");
	    int i=10000;
	    for(RecordGen record:recordlist) {
	    // Create a Solr document with fields specified to be indexed	
	      SolrInputDocument doc = new SolrInputDocument();
	      doc.addField("id", "record-" + i);
	      doc.addField("report_key", record.getRK_REPORTKEY());
	      doc.addField("basic_function",record.getEVTF_BASICFUNCTIONNAME());
	      doc.addField("basic_function_no",record.getEVTF_BASICFUNCTIONNO());
	      doc.addField("batch_no", record.getEVTF_BATCHNO());
	      doc.addField("bf_sequence", record.getEVTF_BFSEQUENCE());
	      doc.addField("basic_operation_no", record.getEVTF_BASICOPERATIONNO());
	      doc.addField("basic_operation_name", record.getEVTF_BASICOPERATIONNAME());
	      
	      
	      server.add(doc);
	      System.out.println("added doc "+i );
	      i++;
	      if(i%100==0) server.commit();  // periodically flush
	    }
	    server.commit();
	  }
	}

