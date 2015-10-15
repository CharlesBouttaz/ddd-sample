package dechet.infra;

import dechet.domain.Expedition;

public class ToEntityMapper {
    public static ExpeditionEntity map(Expedition expedition) {
        ExpeditionEntity expeditionEntity = new ExpeditionEntity();
        expeditionEntity.setId(expedition.getId());
        expeditionEntity.setBsd(expedition.getBsd());
        return expeditionEntity;
    }
}
