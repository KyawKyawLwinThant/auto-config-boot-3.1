package com.demo.config.filestore.network;

import com.demo.config.filestore.FileStore;

public class NetworkFileStore implements FileStore {
    @Override
    public void printFileStoreInfo() {
        System.out.println("Network FileStore.");
    }
}
