package com.demo.config.filestore.network;

import com.demo.config.filestore.FileStore;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AutoConfiguration
@ConditionalOnProperty(name="file.store",havingValue = "network")
public class NetworkFileStoreAutoConfiguration {
    @Bean
    public FileStore networkFileStore(){
        return new NetworkFileStore();
    }
}
