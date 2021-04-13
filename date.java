class date
{
	private int min;
	private int clock;
	private int year;
	private int day;
	private int month;
	public date(int min, int clock, int day, int month, int year)
	{
		this.min=min;
		this.clock=clock;
		this.year=year;
		this.day=day;
		this.month=month;
	}
	public add(int min, int clock)
	{
		this.min=this.min+min;
		if(this.min>60)
		{
			this.min=this.min-60;
			this.clock++;
		}
		this.clock=this.clock+clock;
		if(this.clock>24)
		{
			this.clock=this.clock-24;
			day++;

		}
		switch (month):
		case(1):
	}

}