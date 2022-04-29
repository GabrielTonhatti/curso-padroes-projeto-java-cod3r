package br.com.cod3r.factory.apple.simple;


import br.com.cod3r.factory.apple.simple.factory.IPhoneSimpleFactory;
import br.com.cod3r.factory.apple.simple.model.IPhone;

public class Client {

    public static void main(String[] args) {
        IPhoneSimpleFactory genXFactory = new IPhoneXFactory();
        IPhoneSimpleFactory gen11Factory = new IPhone11Factory();

        System.out.println("### Ordering an iPhone X");
        IPhone iphone = genXFactory.orderIPhone("standard");
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
        System.out.println(iphone2);

    }

}
