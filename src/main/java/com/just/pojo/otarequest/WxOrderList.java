package com.just.pojo.otarequest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flyhigh on 2016/8/1.
 */
public class WxOrderList {
    List<WxRoom> room = new ArrayList<WxRoom>();
    List<WxTicket> ticket = new ArrayList<WxTicket>();
    List<WxPos> pos = new ArrayList<WxPos>();
    List<WxCustomitem> customitem = new ArrayList<WxCustomitem>();

    public List<WxPos> getPos() {
        return pos;
    }

    public void setPos(List<WxPos> pos) {
        if (pos == null)
            pos = new ArrayList<WxPos>();
        this.pos = pos;
    }

    public List<WxTicket> getTicket() {
        return ticket;
    }

    public void setTicket(List<WxTicket> ticket) {
        if (ticket == null)
            ticket = new ArrayList<WxTicket>();
        this.ticket = ticket;
    }

    public List<WxRoom> getRoom() {
        return room;
    }

    public void setRoom(List<WxRoom> room) {
        if (room == null)
            room = new ArrayList<WxRoom>();
        this.room = room;
    }


    public List<WxCustomitem> getCustomitem() {
        return customitem;
    }

    public void setCustomitem(List<WxCustomitem> customitem) {
        if (customitem == null)
            customitem = new ArrayList<WxCustomitem>();
        this.customitem = customitem;
    }


}
