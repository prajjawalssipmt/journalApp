package net.engineeringdigest.journalApp.chache;

import net.engineeringdigest.journalApp.entity.ConfigJournalAppEntity;
import net.engineeringdigest.journalApp.repository.ConfigJournalAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class AppCache {

    public enum  keys{
        WEATHER_API;
    }

    @Autowired
    private ConfigJournalAppRepository configJournalAppRepository;

    public Map<String,String> appCacheMap;


    @PostConstruct
    public void init(){
        appCacheMap=new HashMap<>();
        List<ConfigJournalAppEntity> all =configJournalAppRepository.findAll();
        for (ConfigJournalAppEntity configJournalAppEntity : all) {
            appCacheMap.put(configJournalAppEntity.getKey(),configJournalAppEntity.getValue());
        }
    }
}
