//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Notify_UserBet.java
//  @ Date : 8/4/2012
//  @ Author : @khoa
//
//
package casino.cardgame.message.reponse.game.pokreTournament;

import casino.cardgame.message.reponse.game.poker.*;
import casino.cardgame.message.reponse.SFSGameReponse;
import com.smartfoxserver.v2.entities.data.SFSObject;

public class BeginTourRes extends SFSGameReponse {

    
    public BeginTourRes() {
        super(POKER_TOUR_RESPONSE_NAME.BEGIN_TOUR_RES);
    }

     public SFSObject ToSFSObject() {
        SFSObject obj = new SFSObject();
        return obj;
     }

}
