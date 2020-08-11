package com.mky.design.chain.test;

import org.apache.commons.chain.impl.ChainBase;

/**
 * @author makaiyu
 * @date 2020-08-11 11:17
 */
public class CommandChain extends ChainBase {

    public CommandChain() {
        addCommand(new Commands1());
        addCommand(new Commands2());
        addCommand(new Commands3());
    }

}