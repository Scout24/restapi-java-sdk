package de.is24.rest.api.export.api;

import de.is24.rest.api.search.Searcher;

/**
 * @author Martin Fluegge
 * 
 */
public interface SearchApi {

	public Searcher getSearcher(String username);
}
