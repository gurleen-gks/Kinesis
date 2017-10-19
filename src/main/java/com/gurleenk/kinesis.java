package com.gurleenk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gurleenk on 10/11/17.
 */
public class kinesis {
    private static final Logger LOG = LoggerFactory.getLogger(kinesis.class);

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 200000; i++) {
            LOG.info("Checking kinesis stream logging : " + i);
            Thread.sleep(100);
        }
    }
}
