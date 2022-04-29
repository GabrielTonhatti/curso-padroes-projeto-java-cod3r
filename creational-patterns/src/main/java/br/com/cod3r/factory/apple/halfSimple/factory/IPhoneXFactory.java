package br.com.cod3r.factory.apple.halfSimple.factory;

import br.com.cod3r.factory.apple.halfSimple.model.IPhoneX;
import br.com.cod3r.factory.apple.halfSimple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    @Override
    protected br.com.cod3r.factory.apple.halfSimple.model.IPhone createIPhone(String level) {
        if (level.equals("standard")) {
            return new IPhoneX();
        } else if (level.equals("highEnd")) {
            return new IPhoneXSMax();
        }

        return null;
    }

}
