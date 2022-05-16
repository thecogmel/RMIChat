package com.ufrn.tads.chatserver;

import com.ufrn.tads.chatclient.ChatClientIF;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatServerIF extends Remote {
    void registerChatClient(ChatClientIF chatClient) throws RemoteException;
    void broadcastMessage(String message) throws RemoteException;
}
