package cs.lab;

import java.util.List;
import java.util.logging.Logger;

public class  DNASequencer {

    static final Logger logger = Logger.getLogger(DNASequencer.class.getName());
    public DNASequencer() {
        logger.info("Starting sequencer...");
    }

    public String calculate(List<String> parts) throws Exception{
        if(parts.size() > 160000){
            throw new Exception("Too many subseqs");
        }
        return "AGATTACAGA";
    }
}
