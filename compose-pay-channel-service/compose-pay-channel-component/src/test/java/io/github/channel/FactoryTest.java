package io.github.channel;

import io.github.pleuvoir.channel.common.ChannelEnum;
import io.github.pleuvoir.channel.common.TransEnum;
import io.github.pleuvoir.channel.core.DefaultChannelServiceFactory;
import io.github.pleuvoir.channel.core.IChannelService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author <a href="mailto:fuwei@daojia-inc.com">pleuvoir</a>
 */
public class FactoryTest extends BaseTest {

    @Autowired
    private DefaultChannelServiceFactory servicePluginFactory;
    @Test
    public void test(){
        IChannelService channelService = servicePluginFactory.getChannelService(ChannelEnum.TEST, TransEnum.PAY);

        System.out.println("-=-=-=" + channelService);
    }
}