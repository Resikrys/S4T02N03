package cat.itacademy.s04.t02.n03.S04T02N03.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FruitEventListener {

    @EventListener
    public void handleFruitQuantityChange(FruitQuantityChangedEvent event) {
        log.info("📢 The quantity of the fruit '{}' has changed to {} kilos.",
                event.getFruit().getName(), event.getFruit().getQuantityKilos());
    }

    @EventListener
    public void handleFruitDeletion(FruitDeletedEvent event) {
        log.warn("⚠️ Warning! The fruit '{}' with id '{}' has been removed. It is no longer available.",
                event.getFruit().getName(), event.getFruit().getId());
    }

}
