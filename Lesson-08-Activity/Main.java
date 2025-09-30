class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
	print("wsg");
	FtoC(56);
	sphereVolume(2);
	coneVolume(2, 2);
	distance(4,3,2,1);
  }

  	void print(String msg){
	System.out.println(msg);
	}
	
	void FtoC(double f){
		double c=(f-32)*5/9;
	System.out.println(c);
	}
 
	void sphereVolume(double r){
		double s=(4/3.0)*Math.pow((Math.PI*r),3);
	System.out.println(s);
	}

	void coneVolume(double r, double h){
		double cvv=Math.pow(Math.PI*r,2)*(h/3.0);
	System.out.println(cvv);
	}

	void distance(double x1, double x2, double y1, double y2){
		double dist=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
	System.out.println(dist);
	}

	
}