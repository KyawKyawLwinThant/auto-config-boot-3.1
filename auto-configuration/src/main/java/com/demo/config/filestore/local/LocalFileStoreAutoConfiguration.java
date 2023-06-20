package com.demo.config.filestore.local;

import com.demo.config.filestore.FileStore;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@ConditionalOnProperty(name="file.store",havingValue = "local")
public class LocalFileStoreAutoConfiguration {
    @Bean
    public FileStore fileStore(){
        return new LocalFileStore();
    }
}
