package com.mky.design.chain.test;

import org.apache.commons.chain.Context;
import org.apache.commons.chain.impl.ContextBase;
import org.junit.jupiter.api.Test;

/**
 * @author makaiyu
 * @date 2020-08-11 11:26
 */

public class CommandTest {

    @Test
    public void test() throws Exception {
        CommandChain commandChain = new CommandChain();
        Context context = new ContextBase();
        context.put("k1", 1);
        commandChain.execute(context);
    }
}