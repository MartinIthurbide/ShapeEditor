package xshape;

import xshape.gui.*;

public class App {

    public static void main(String[] args) {
        XShape appAwt = new AwtApp();
        appAwt.run();
        XShape appFx = new FxApp();
        appFx.run();

    }

}
