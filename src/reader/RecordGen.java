package reader;

public class RecordGen {
		String RK_REPORTKEY;
		String EVTF_BASICOPERATIONNO;
		String  EVTF_BASICOPERATIONNAME;
		String EVTF_BOSEQUENCE;
		String EVTF_PRODUCTIONUNITNO;
		String EVTF_BASICFUNCTIONNO;
		String EVTF_BASICFUNCTIONNAME;
		String  EVTF_BFSEQUENCE;
		String  EVTF_TECHNICALFUNCTIONNO;
		String  EVTF_TECHNICALFUNCTIONNAME;
		String EVTF_TFSEQUENCE;
		String EVTF_TECHNICALFUNCTIONTYPE;
		String EVTF_TECHNICALFUNCTIONMODE;
		String EVTF_MONO;
		String EVTF_SFONO;
		String EVTF_RUN;
		String EVTF_BATCHNO;
		String EVTF_MO_MATERIALNO;
		String EVTF_MO_MATERIALNAME;
		String EVTF_MO_ACTUALSTART;
		String EVTF_MO_ACTUALEND;
		String EVTF_SFO_ACTUALSTART;
		String EVTF_SFO_ACTUALEND;
		String EVTF_SETFLOAT;
		String EVTF_SV_SETVALUEASSTRING;
		String EVTF_VALIDOPERATIONRANGEMIN;
		String EVTF_VALIDOPERATIONRANGEMAX;
		String EVTF_MINSPECIFICATIONLIMIT;
		String EVTF_MAXSPECIFICATIONLIMIT;
		String EVTF_MINACTIONLIMIT;
		String EVTF_MAXACTIONLIMIT;
		String EVTF_MINCONTROLLIMIT;
		String EVTF_MAXCONTROLLIMIT;
		String EVTF_FLOATVALUE;
		String EVTF_BOOLVALUETEXT;
		String EVTF_TEXTVALUE;
		String EVTF_TEXT;
		String EVTF_UOM;
		String EVTF_STATUS;
		String EVTF_STATUSTEXTLONG;
		String EVTF_DATE;
		String EVTF_COMMENT;
		String EVTF_MARKER_1;
		String EVTF_MARKER_2;
		String EVTF_MARKER_3;
		String EVTF_CYCLENO;
		String EVTF_EVALUATION;
		
	

		public  RecordGen (String [] datarow){
			       this.RK_REPORTKEY							=datarow[0];
					this.EVTF_BASICOPERATIONNO		=datarow[1];
					this. EVTF_BASICOPERATIONNAME=datarow[2];
					this.EVTF_BOSEQUENCE					=datarow[3]; 
					this.EVTF_PRODUCTIONUNITNO	=datarow[4];
					this.EVTF_BASICFUNCTIONNO		=datarow[5];
					this.EVTF_BASICFUNCTIONNAME	=datarow[6];
					this. EVTF_BFSEQUENCE				=datarow[7];
					this. EVTF_TECHNICALFUNCTIONNO=datarow[8];
					
					this. EVTF_TECHNICALFUNCTIONNAME= datarow[9];
					this.EVTF_TFSEQUENCE							=datarow[10];
					this.EVTF_TECHNICALFUNCTIONTYPE	=datarow[11];
					this.EVTF_TECHNICALFUNCTIONMODE  =datarow[12];
					this.EVTF_MONO										=datarow[13];
					this.EVTF_SFONO									=datarow[14];
					this.EVTF_RUN										=datarow[15];
					this.EVTF_BATCHNO								=datarow[16];
					this.EVTF_MO_MATERIALNO					=datarow[17];
					this.EVTF_MO_MATERIALNAME				=datarow[18];
					this.EVTF_MO_ACTUALSTART					=datarow[19];
					this.EVTF_MO_ACTUALEND					=datarow[20];
					this.EVTF_SFO_ACTUALSTART				=datarow[21];
					this.EVTF_SFO_ACTUALEND					=datarow[22];
					this.EVTF_SETFLOAT								=datarow[23];
					this.EVTF_SV_SETVALUEASSTRING			=datarow[24];
					this.EVTF_VALIDOPERATIONRANGEMIN	=datarow[25];
					this.EVTF_VALIDOPERATIONRANGEMAX	=datarow[26];
					this.EVTF_MINSPECIFICATIONLIMIT		=datarow[27];
					this.EVTF_MAXSPECIFICATIONLIMIT		=datarow[29];
					this.EVTF_MINACTIONLIMIT					=datarow[29];
					this.EVTF_MAXACTIONLIMIT					=datarow[30];
					this.EVTF_MINCONTROLLIMIT				=datarow[31];
					this.EVTF_MAXCONTROLLIMIT				=datarow[32];
					this.EVTF_FLOATVALUE							=datarow[33];
					
					this.EVTF_BOOLVALUETEXT					=datarow[34];
					this.EVTF_TEXTVALUE								=datarow[35];
					this.EVTF_TEXT										=datarow[36];
					this.EVTF_UOM										=datarow[38];
					this.EVTF_STATUS									=datarow[39];
					this.EVTF_STATUSTEXTLONG					=datarow[40];
					this.EVTF_DATE										=datarow[41];
					this.EVTF_COMMENT								=datarow[42];
					
//					this.EVTF_MARKER_1								=datarow[43];
//					this.EVTF_MARKER_2								=datarow[44];
//					this.EVTF_MARKER_3								=datarow[45];
//					this.EVTF_CYCLENO								=datarow[46];
//					this.EVTF_EVALUATION  							=datarow[47];
				
			}



		public String getEVTF_BASICOPERATIONNO() {
			return EVTF_BASICOPERATIONNO;
		}



		public void setEVTF_BASICOPERATIONNO(String eVTF_BASICOPERATIONNO) {
			EVTF_BASICOPERATIONNO = eVTF_BASICOPERATIONNO;
		}



		public String getEVTF_BASICOPERATIONNAME() {
			return EVTF_BASICOPERATIONNAME;
		}



		public void setEVTF_BASICOPERATIONNAME(String eVTF_BASICOPERATIONNAME) {
			EVTF_BASICOPERATIONNAME = eVTF_BASICOPERATIONNAME;
		}



		public String getEVTF_BOSEQUENCE() {
			return EVTF_BOSEQUENCE;
		}



		public void setEVTF_BOSEQUENCE(String eVTF_BOSEQUENCE) {
			EVTF_BOSEQUENCE = eVTF_BOSEQUENCE;
		}



		public String getEVTF_BASICFUNCTIONNO() {
			return EVTF_BASICFUNCTIONNO;
		}



		public void setEVTF_BASICFUNCTIONNO(String eVTF_BASICFUNCTIONNO) {
			EVTF_BASICFUNCTIONNO = eVTF_BASICFUNCTIONNO;
		}



		public String getEVTF_BASICFUNCTIONNAME() {
			return EVTF_BASICFUNCTIONNAME;
		}



		public void setEVTF_BASICFUNCTIONNAME(String eVTF_BASICFUNCTIONNAME) {
			EVTF_BASICFUNCTIONNAME = eVTF_BASICFUNCTIONNAME;
		}



		public String getEVTF_BFSEQUENCE() {
			return EVTF_BFSEQUENCE;
		}



		public void setEVTF_BFSEQUENCE(String eVTF_BFSEQUENCE) {
			EVTF_BFSEQUENCE = eVTF_BFSEQUENCE;
		}



		public String getEVTF_BATCHNO() {
			return EVTF_BATCHNO;
		}



		public void setEVTF_BATCHNO(String eVTF_BATCHNO) {
			EVTF_BATCHNO = eVTF_BATCHNO;
		}



		public String getEVTF_BOOLVALUETEXT() {
			return EVTF_BOOLVALUETEXT;
		}



		public void setEVTF_BOOLVALUETEXT(String eVTF_BOOLVALUETEXT) {
			EVTF_BOOLVALUETEXT = eVTF_BOOLVALUETEXT;
		}



		public String getRK_REPORTKEY() {
			return RK_REPORTKEY;
		}



		public void setRK_REPORTKEY(String rK_REPORTKEY) {
			RK_REPORTKEY = rK_REPORTKEY;
		}
				
			
		}


