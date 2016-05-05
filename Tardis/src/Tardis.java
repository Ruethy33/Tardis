import java.util.ArrayList;

public class Tardis
	{
	private String planet;
	private String location;
	private String race;
	private int planetAge;
	private int population;
	private int time;
	static ArrayList tardis;
	
	public Tardis(String p, String l, String r, int a, int pop, int t)
		{
		planet = p;
		location = l;
		race = r;
		planetAge = a;
		population = pop;
		time = t;
		}

	public int getTime()
		{
			return time;
		}

	public void setTime(int time)
		{
			this.time = time;
		}

	public String getPlanet()
		{
			return planet;
		}

	public void setPlanet(String planet)
		{
			this.planet = planet;
		}

	public String getLocation()
		{
			return location;
		}

	public void setLocation(String location)
		{
			this.location = location;
		}

	public String getRace()
		{
			return race;
		}

	public void setRace(String race)
		{
			this.race = race;
		}

	public int getPlanetAge()
		{
			return planetAge;
		}

	public void setPlanetAge(int planetAge)
		{
			this.planetAge = planetAge;
		}

	public int getPopulation()
		{
			return population;
		}

	public void setPopulation(int population)
		{
			this.population = population;
		}

	public static ArrayList getTardis()
		{
			return tardis;
		}

	public static void setTardis(ArrayList tardis)
		{
			Tardis.tardis = tardis;
		}
	}
