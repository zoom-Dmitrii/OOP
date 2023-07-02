package lesson5;

public class test {
}

/*

 открытый класс Complex {// множественный класс
	 double real; // реальная часть
	 double image; // мнимая часть

	 Complex () {// Конструктор без параметров
		Scanner input = new Scanner(System.in);
		double real = input.nextDouble();
		double image = input.nextDouble();
		Complex(real,image);
	}

	 private void Complex (double real, double image) {// для конструкторов без аргументов
		// TODO Auto-generated method stub
		this.real = real;
		this.image = image;
	}

	 Complex (double real, double image) {// конструктор с параметрами
		this.real = real;
		this.image = image;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImage() {
		return image;
	}

	public void setImage(double image) {
		this.image = image;
	}

	 Complex add (Комплекс а) {// Добавить комплексные числа
		double real2 = a.getReal();
		double image2 = a.getImage();
		double newReal = real + real2;
		double newImage = image + image2;
		Complex result = new Complex(newReal,newImage);
		return result;
	}

	 Complex sub (Complex a) {// Вычитаем комплексные числа
		double real2 = a.getReal();
		double image2 = a.getImage();
		double newReal = real - real2;
		double newImage = image - image2;
		Complex result = new Complex(newReal,newImage);
		return result;
	}

	 Complex mul (Complex a) {// умножить комплексные числа
		double real2 = a.getReal();
		double image2 = a.getImage();
		double newReal = real*real2 - image*image2;
		double newImage = image*real2 + real*image2;
		Complex result = new Complex(newReal,newImage);
		return result;
	}

	 Complex div (Комплекс а) {// Делим комплексные числа
		double real2 = a.getReal();
		double image2 = a.getImage();
		double newReal = (real*real2 + image*image2)/(real2*real2 + image2*image2);
		double newImage = (image*real2 - real*image2)/(real2*real2 + image2*image2);
		Complex result = new Complex(newReal,newImage);
		return result;
	}

	 public void print () {// вывод
		if(image > 0){
			System.out.println(real + " + " + image + "i");
		}else if(image < 0){
			System.out.println(real + "" + image + "i");
		}else{
			System.out.println(real);
		}
	}
}


 */
