
package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.exception.PlayerException;

public interface Playable {
	public StringBuffer play() throws PlayerException;
}