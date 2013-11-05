/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.test.client_1.x.integration.cluster;

import org.junit.Assert;
import org.junit.Test;

import com.dianping.pigeon.test.client_1.x.BaseInvokerTest;
import com.dianping.pigeon.test.client_1.x.PigeonAutoTest;
import com.dianping.pigeon.test.service.EchoService;

public class FailfastClusterEchoServiceTest extends BaseInvokerTest {

	@PigeonAutoTest(serviceName = "http://service.dianping.com/testService/echoService_1.0.0", cluster = "failfast")
	public EchoService echoService;

	@Test
	public void test() {
		String echo = echoService.echo("dianping");
		Assert.assertEquals("echo:dianping", echo);
	}
}