package br.com.cod3r.factory.apple.after;

import br.com.cod3r.factory.apple.after.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.after.factory.IPhone11ProFactory;
import br.com.cod3r.factory.apple.after.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.after.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.after.model.IPhone;

public class Client {

    public static void main(String[] args) {
        IPhoneFactory iphoneXFactory = new IPhoneXFactory();
        IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();
        IPhoneFactory iphone11Factory = new IPhone11Factory();

        System.out.println("### Ordering an iPhone X");
        IPhone iPhoneX = iphoneXFactory.orderIPhone();
        System.out.println(iPhoneX);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iPhone11Pro = iphone11ProFactory.orderIPhone();
        System.out.println(iPhone11Pro);

        System.out.println("\n\n### Ordering an iPhone 11");
        IPhone iPhone11 = iphone11Factory.orderIPhone();
        System.out.println(iPhone11);
    }

}
