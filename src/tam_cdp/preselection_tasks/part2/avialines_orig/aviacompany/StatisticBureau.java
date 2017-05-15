package tam_cdp.preselection_tasks.part2.avialines_orig.aviacompany;

import tam_cdp.preselection_tasks.part2.avialines_orig.plains.Plane;

import java.util.NavigableMap;
import java.util.TreeMap;



public class StatisticBureau implements BrandName {
	AircraftFleet airFl = new AircraftFleet();

	public AircraftFleet getAirFl() {
		return airFl;
	}

	public void setAirFl(AircraftFleet airFl) {
		this.airFl = airFl;
	}

	protected int getTotalCargoCapacity() {
		int capacity = 0;
		for (Plane pl : airFl) {
			capacity += pl.getCargoCapacity();
		}
		return capacity;
	}

	protected int getTotalPassengerCapacity() {
		int capacity = 0;
		for (Plane pl : airFl) {
			capacity += pl.getPassengerCapacity();
		}
		return capacity;
	}

	protected TreeMap<Integer, String> sortByflightRangeAsc() {
		TreeMap<Integer, String> sortedPlains = new TreeMap<Integer, String>();
		for (Plane pl : airFl) {
			sortedPlains.put(pl.getFlightRange(), pl.getPlaneName());
		}
		return sortedPlains;
	}

	protected NavigableMap<Integer, String> sortByflightRangeDesc() {
		TreeMap<Integer, String> sortedPlains = new TreeMap<Integer, String>();
		NavigableMap<Integer, String> map = null;
		for (Plane pl : airFl) {
			sortedPlains.put(pl.getFlightRange(), pl.getPlaneName());
			map = sortedPlains.descendingMap();
		}
		return map;
	}

	@Override
	public String getBrandName() {
		return brandName + "Statistics";
	}
}
