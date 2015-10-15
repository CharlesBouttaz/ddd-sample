package dechet.domain;

public interface ExpedtitionRepository {

    void saveExpedition(Expedition expedition);

    void addTransporter(String TransporterId);
}
