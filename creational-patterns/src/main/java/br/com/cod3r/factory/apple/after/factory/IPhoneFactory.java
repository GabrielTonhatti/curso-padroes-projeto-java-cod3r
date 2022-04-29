package br.com.cod3r.factory.apple.after.factory;

import br.com.cod3r.factory.apple.after.model.*;

public abstract class IPhoneFactory {

    public br.com.cod3r.factory.apple.after.model.IPhone orderIPhone() {
        IPhone device = null;

        device = createIPhone();

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIPhone();

}
