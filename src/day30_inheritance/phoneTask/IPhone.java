package day30_inheritance.phoneTask;

public class IPhone extends Phone { // Iphone Is A Phone

    public IPhone(String model, String size, String color, double price){
        super("Apple",  model, size, color, price);
    }


    public static boolean hasApplePay = true;

    public void faceTime(long phoneNumber){

    }

    public void faceTime(String email){

    }



}

/*
2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)
 */