package net.CyanWool.api.network;

import net.CyanWool.api.Server;
import net.CyanWool.entity.player.CyanPlayer;

import org.spacehq.packetlib.event.session.SessionListener;
import org.spacehq.packetlib.packet.Packet;

public interface PlayerNetwork {

    public CyanPlayer getPlayer();

    public void sendPacket(Packet packet);

    public void addListener(SessionListener listener);

    public void removeListener(SessionListener listener);

    public void disconnect(String string);

    public String getHost();

    public Server getServer();
}