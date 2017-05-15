package tam_cdp.preselection_tasks.part2.avialines_orig.aviacompany;

import java.util.ArrayList;

import tam_cdp.preselection_tasks.part2.avialines_orig.plains.*;

public class AircraftFleet extends ArrayList<Plane> implements BrandName{
	
	private static final long serialVersionUID = 1L;
	AirbusA340 airbusA340 = new AirbusA340();
	An_124 an124 = new An_124();
	An_225 an225 = new An_225();
	Boeing737 boeing737 = new Boeing737();
	Boeing747_400ER boeing747_400ER = new Boeing747_400ER();
	Boeing747_400F boeing747_400F = new Boeing747_400F();

	public AircraftFleet() {
		this.add(airbusA340);
		this.add(an124);
		this.add(an225);
		this.add(boeing737);
		this.add(boeing747_400ER);
		this.add(boeing747_400F);
	}

	public AirbusA340 getAirbusA340() {
		return airbusA340;
	}

	public void setAirbusA340(AirbusA340 airbusA340) {
		this.airbusA340 = airbusA340;
	}

	public An_124 getAn124() {
		return an124;
	}

	public void setAn124(An_124 an124) {
		this.an124 = an124;
	}

	public An_225 getAn225() {
		return an225;
	}

	public void setAn225(An_225 an225) {
		this.an225 = an225;
	}

	public Boeing737 getBoeing737() {
		return boeing737;
	}

	public void setBoeing737(Boeing737 boeing737) {
		this.boeing737 = boeing737;
	}

	public Boeing747_400ER getBoeing747_400ER() {
		return boeing747_400ER;
	}

	public void setBoeing747_400ER(Boeing747_400ER boeing747_400er) {
		boeing747_400ER = boeing747_400er;
	}

	public Boeing747_400F getBoeing747_400F() {
		return boeing747_400F;
	}

	public void setBoeing747_400F(Boeing747_400F boeing747_400f) {
		boeing747_400F = boeing747_400f;
	}

	@Override
	public String getBrandName() {
		return brandName + "ToursProposals";
	}

}
