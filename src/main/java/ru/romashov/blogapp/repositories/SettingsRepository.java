package ru.romashov.blogapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.romashov.blogapp.enums.GlobalSettings;
import ru.romashov.blogapp.model.Settings;

@Repository
public interface SettingsRepository extends CrudRepository<Settings, Integer> {
    Settings findByCodeIs(GlobalSettings.Code code);
}
