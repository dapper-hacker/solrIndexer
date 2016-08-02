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


	  public void Indexing (List<RecordGen> recordlist)throws IOException, SolrServerException {
	    HttpSolrServer server = new HttpSolrServer("http://localhost:8983/solr/test_core");
	    int i=0;
	    for(RecordGen record:recordlist) {
	    	
	      SolrInputDocument doc = new SolrInputDocument();
	      doc.addField("cat",record.getEVTF_BASICFUNCTIONNAME());
//	      doc.addField("Basic_function",record.getEVTF_BASICFUNCTIONNAME());
	      doc.addField("id", "record-" + i);
//	      doc.addField("Report_key", record.getRK_REPORTKEY());
//	      doc.addField("Function_no", record.getEVTF_BASICFUNCTIONNO());
//	      doc.addField("Operation_name", record.getEVTF_BASICOPERATIONNAME());
//	      doc.addField("Batch_no", record.getEVTF_BATCHNO());
//	      doc.addField("Bf_sequence", record.getEVTF_BFSEQUENCE());
	      
	      server.add(doc);
	      System.out.println("added doc "+i );
	      i++;
	      if(i%100==0) server.commit();  // periodically flush
	    }
	    server.commit();
	  }
	}

