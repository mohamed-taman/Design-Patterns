package com.siriusxi.principle.coupling;

import com.siriusxi.principle.coupling.loose.Device;
import com.siriusxi.principle.coupling.loose.LCRemote;
import com.siriusxi.principle.coupling.loose.LCTelevision;
import com.siriusxi.principle.coupling.loose.Radio;
import com.siriusxi.principle.coupling.tight.Remote;
import com.siriusxi.principle.coupling.tight.Television;
import lombok.extern.java.Log;

@Log
public class RemoteSimulator {
    
    public static void main(String[] args) {
        // Tight coupling implementation
        Television tv = new Television();
        Remote remote = new Remote(tv);
        
        remote.switchOn();
        log.info("Watching programs and eating popcorn!");
        remote.switchOff();
    
        // Loose coupling implementation
        log.info("---------------------------");
        Device radio = new Radio();
        Device lcTv = new LCTelevision();
    
        LCRemote radioRemote = new LCRemote(radio);
        LCRemote tvRemote = new LCRemote(lcTv);
        
        radioRemote.switchOn();
        log.info("Listening to Radio programs!");
        radioRemote.switchOff();
    
        tvRemote.switchOn();
        log.info("Watching TV programs and eating popcorn!");
        tvRemote.switchOff();
    }
}
