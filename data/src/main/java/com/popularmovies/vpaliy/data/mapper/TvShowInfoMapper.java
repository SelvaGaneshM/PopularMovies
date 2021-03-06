package com.popularmovies.vpaliy.data.mapper;


import com.popularmovies.vpaliy.data.entity.TvShowInfoEntity;
import com.popularmovies.vpaliy.domain.model.TVShowInfo;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import static com.popularmovies.vpaliy.data.utils.MapperUtils.convertToNetworks;
import static com.popularmovies.vpaliy.data.utils.MapperUtils.convertToString;

@Singleton
public class TvShowInfoMapper extends Mapper<TVShowInfo,TvShowInfoEntity> {

    @Inject
    public TvShowInfoMapper(){}

    @Override
    public TVShowInfo map(TvShowInfoEntity tvShowInfoEntity) {
        TVShowInfo info=new TVShowInfo();
        info.setTvShowId(tvShowInfoEntity.getTvShowId());
        info.setOverview(tvShowInfoEntity.getOverview());
        info.setPopularity(tvShowInfoEntity.getPopularity().doubleValue());
        info.setVoteCount(tvShowInfoEntity.getVoteCount());
        info.setAverageRate(tvShowInfoEntity.getVoteAverage().doubleValue());
        info.setEpisodeRuntime(tvShowInfoEntity.getEpisodeRuntime());
        info.setFirstAirDate(tvShowInfoEntity.getFirstAirDate());
        info.setLastAirDate(tvShowInfoEntity.getLastAirDate());
        info.setName(tvShowInfoEntity.getName());
        info.setNetworks(convertToString(tvShowInfoEntity.getNetworks()));
        info.setNumberOfEpisodes(tvShowInfoEntity.getNumberOfEpisodes());
        info.setNumberOfSeasons(tvShowInfoEntity.getNumberOfSeasons());
        info.setOriginalLanguage(tvShowInfoEntity.getOriginalLanguage());
        info.setStatus(tvShowInfoEntity.getStatus());
        return info;
    }

    @Override
    public TvShowInfoEntity reverseMap(TVShowInfo info) {
        TvShowInfoEntity entity=new TvShowInfoEntity();
        entity.setTvShowId(info.getTvShowId());
        entity.setOverview(info.getOverview());
        entity.setPopularity(info.getPopularity());
        entity.setVoteAverage(info.getVoteCount());
        entity.setVoteAverage(info.getAverageRate());
        entity.setEpisodeRuntime(info.getEpisodeRuntime());
        entity.setFirstAirDate(info.getFirstAirDate());
        entity.setLastAirDate(info.getLastAirDate());
        entity.setName(info.getName());
        entity.setNetworks(convertToNetworks(info.getNetworks()));
        entity.setNumberOfEpisodes(info.getNumberOfEpisodes());
        entity.setNumberOfSeasons(info.getNumberOfSeasons());
        entity.setOriginalLanguage(info.getOriginalLanguage());
        entity.setStatus(info.getStatus());
        entity.setVoteCount(info.getVoteCount());
        return entity;
    }

}
