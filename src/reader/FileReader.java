package reader;
import java.io.*;
import java.util.*;
import java.net.*;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.conf.*;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapred.*;
import org.apache.hadoop.util.*;
import org.apache.log4j.Logger;
import org.apache.solr.client.solrj.SolrServerException;

import SolrIndexer.MyIndexer;
public class FileReader {
	static List  <RecordGen> mylist = new ArrayList<RecordGen>();
	        public static void main (String [] args) throws Exception{
	        	
	                try{
	                        Path pt=new Path("hdfs://bigdata.ibm.com:9000/user/vin/EVALTECHNICALFUNCTION_head_t.tab");
	                        Configuration conf = new Configuration();
	                       conf.addResource(new Path("/opt/ibm/biginsights/hadoop-conf/core-site.xml"));
	                     conf.addResource(new Path("/opt/ibm/biginsights/hadoop-conf/hdfs-site.xml"));
	                        FileSystem fs = FileSystem.get(conf);
	                        
	                        BufferedReader br=new BufferedReader(new InputStreamReader(fs.open(pt)));
	                        String line;
	                        line=br.readLine();
	                        String datavalue[] = line.split("\t");
	                                 getRecord(datavalue);
                               while (line != null){
	                               
//	                        	for(String data:datavalue)
//	                                System.out.print(data+" ,");
	                                line=br.readLine();
	                               datavalue =line.split("\t");
	                               getRecord(datavalue);
                            
	                        }
                            
                              
	                }catch(Exception e){
	                }
	                indexStuff(mylist); 
	                for (RecordGen record:mylist){
                  	 // System.out.println(record.getEVTF_BASICOPERATIONNAME());
                    }
	                
	        }
	        
	        public static void getRecord(String [] data){
	        	RecordGen record = new RecordGen(data);
	        	mylist.add(record);
				
	        }
	        public static void indexStuff(List<RecordGen> mylist2){
	        	mylist2=mylist;
	        	 MyIndexer indexer = new MyIndexer();
		          
		            try {
						indexer.Indexing(mylist2);
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SolrServerException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		            System.out.println("I am happy and done");
		        	
		        }
	        	
	        }
	        

	        


