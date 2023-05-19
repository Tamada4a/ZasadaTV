package com.example.zasada_tv.mongo_collections.interfaces;


import com.example.zasada_tv.mongo_collections.documents.PlayerDoc;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;


/**
 * Интерфейс, отвечающий за выполнение всех операций с коллекцией {@link PlayerDoc}
 * */

@Repository
public interface PlayerRepository extends MongoRepository<PlayerDoc, String> {
    ArrayList<PlayerDoc> findByUserId(final String userId);
    ArrayList<PlayerDoc> findByNick(final String nick);
    ArrayList<PlayerDoc> findByFname(final String fname);
    ArrayList<PlayerDoc> findByBdate(final LocalDateTime bdate);
    ArrayList<PlayerDoc> findByCountry(final String country);
    ArrayList<PlayerDoc> findByCity(final String city);
    ArrayList<PlayerDoc> findBySteam(final String steam);
    ArrayList<PlayerDoc> findByFaceit(final String faceit);
    ArrayList<PlayerDoc> findByDiscord(final String discord);
    ArrayList<PlayerDoc> findByVk(final String vk);
    ArrayList<PlayerDoc> findByTeamName(final String teamName);
    ArrayList<PlayerDoc> findByTeamRole(final String teamRole);

    void deleteByUserId(final String userId);
    void deleteByNick(final String nick);
    void deleteByFname(final String fname);
    void deleteByBdate(final LocalDateTime bdate);
    void deleteByCountry(final String country);
    void deleteByCity(final String city);
    void deleteBySteam(final String steam);
    void deleteByFaceit(final String faceit);
    void deleteByDiscord(final String discord);
    void deleteByVk(final String vk);
    void deleteByTeamName(final String teamName);
    void deleteByTeamRole(final String teamRole);

    boolean existsByUserId(final String userId);
    boolean existsByNick(final String nick);
    boolean existsByFname(final String fname);
    boolean existsByBdate(final LocalDateTime bdate);
    boolean existsByCountry(final String country);
    boolean existsByCity(final String city);
    boolean existsBySteam(final String steam);
    boolean existsByFaceit(final String faceit);
    boolean existsByDiscord(final String discord);
    boolean existsByVk(final String vk);
    boolean existsByTeamName(final String teamName);
    boolean existsByTeamRole(final String teamRole);
}
