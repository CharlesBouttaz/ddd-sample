package dechet.domain;

/**
 * AggregateRoot
 */
public class Expedition {
    String id;
    String bsd;

    ExpedtitionRepository expedtitionRepository;

    public Expedition(ExpedtitionRepository expedtitionRepository) {
        this.expedtitionRepository = expedtitionRepository;
    }

    public String getId() {
        return id;
    }

    public String getBsd() {
        return bsd;
    }

    void addTransporteur(String transporterId){
//        expedtitionRepository.getTransporter(transporterId);
    }

    //Dechet dechet;

}
