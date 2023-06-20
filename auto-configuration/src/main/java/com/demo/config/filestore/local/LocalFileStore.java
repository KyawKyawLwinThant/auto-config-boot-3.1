package com.demo.config.filestore.local;

import com.demo.config.filestore.FileStore;

public class LocalFileStore implements FileStore {
    @Override
    public void printFileStoreInfo() {
        System.out.println("Local FileStore.");
    }
}
