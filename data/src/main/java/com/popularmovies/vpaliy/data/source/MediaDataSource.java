package com.popularmovies.vpaliy.data.source;


import com.popularmovies.vpaliy.domain.IMediaRepository;
import com.popularmovies.vpaliy.domain.configuration.ISortConfiguration.SortType;

public abstract class MediaDataSource<T,D> implements IMediaRepository<T,D> {
   public abstract void insert(T item, SortType sortType);
   public abstract void insertDetails(D details);

}