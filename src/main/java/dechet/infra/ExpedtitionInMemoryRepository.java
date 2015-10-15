package dechet.infra;

import dechet.domain.Expedition;
import dechet.domain.ExpedtitionRepository;

public class ExpedtitionInMemoryRepository implements ExpedtitionRepository {

    private ExpeditionDAO expeditionDAO;

    public ExpedtitionInMemoryRepository(ExpeditionDAO expeditionDAO) {
        this.expeditionDAO = expeditionDAO;
    }

    public void saveExpedition(Expedition expedition) {
        ExpeditionEntity expeditionEntity = ToEntityMapper.map(expedition);
        expeditionDAO.save(expeditionEntity);
    }

    public void addTransporter(String TransporterId) {

    }
}
