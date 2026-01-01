package stockanalysis.view;

import stockanalysis.model.Publisher;

interface Subscriber {
	void update(Publisher p, Object obj);
}
