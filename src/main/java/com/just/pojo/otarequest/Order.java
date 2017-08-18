package com.just.pojo.otarequest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flyhigh on 2016/5/19.
 */
public class Order {
    List<Room> room = new ArrayList<Room>();
    List<Pos> pos = new ArrayList<Pos>();
    List<Ticket> ticket = new ArrayList<Ticket>();
    List<KitInfo> kitInfos = new ArrayList<KitInfo>();

    public List<KitInfo> getKitInfos() {
        return kitInfos;
    }

    public void setKitInfos(List<KitInfo> kitInfos) {
        this.kitInfos = kitInfos;
    }

    public List<Pos> getPos() {
        return pos;
    }

    public void setPos(List<Pos> pos) {
        this.pos = pos;
    }

    public List<Room> getRoom() {
        return room;
    }

    public void setRoom(List<Room> room) {
        this.room = room;
    }

    public List<Ticket> getTicket() {
        return ticket;
    }

    public void setTicket(List<Ticket> ticket) {
        this.ticket = ticket;
    }
}
