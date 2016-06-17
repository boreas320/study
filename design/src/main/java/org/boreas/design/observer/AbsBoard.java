package org.boreas.design.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by xiangshuai on 16/6/15.
 */
public abstract class AbsBoard<W extends Observable> implements Board, Observer {


    private Observable observable;

    public AbsBoard(W w) {

        this.observable = w;
        observable.addObserver(this);
    }
}
