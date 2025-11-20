
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
		gpa(90);
		isGraduating(44, 12);
		BMI(5, 5);
		shippingCost(5);
		blueOrViolet(676);

  }

 double gpa(double grade){
	if (grade>=90){
		return grade*1.1;
	}
	else{
		return grade;
	}
	}

boolean isGraduating(int credits, int gradelvl){
	if (credits>=44 && gradelvl==12){
		return true;
	}
	else{
		return false;
	}
}

String BMI(double weight, double height){
	double bmi=weight*height;
	if (bmi<=18.4){
		return "Underweight";
	}
	else if (bmi>=18.5 && bmi<=24.9){
		return "Normal";
	}
	else if (bmi>=25.0 && bmi<=39.9){
		return "Overweight";
	}
	else if (bmi<=40.0){
		return "Obese";
	}
}

double shippingCost(double WEIGHT){
	if (WEIGHT<=10.00){
		return -0.00;
	}
	else if (WEIGHT>=10.00 && WEIGHT<=15.00){
		return -5.00;
	}
	else if (WEIGHT>=15.00 && WEIGHT<=25.00){
		return -10.00;
	}
	else if (WEIGHT<=25.00){
		return -10.00+(2.00*(WEIGHT-25.00));
	}
}

boolean blueOrViolet(int THZ){
	if(THZ>=600 && THZ<=670){
		return true;
	}
	else if(THZ>=700 && THZ<=750){
		return true;
	}
	else{
		return false;
	}
}
 }
  