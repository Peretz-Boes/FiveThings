package com.example.android.fivethings;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void showAlabamaFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Alabama workers built the first rocket to put humans on the moon. \n";
        text+="The world's first Electric Trolley System was introduced in Montgomery in 1886. \n";
        text+="Alabama is the only state with all major natural resources needed to make iron and steel. It is also the largest supplier of cast-iron and steel pipe products. \n";
        text+="Montgomery is the capital and the birthplace of the Confederate States of America. \n";
        text+="The Confederate flag was designed and first flown in Alabama in 1861. ";
        textView.setText(text);
    }
    public void showAlaskaFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Outsiders first discovered Alaska in 1741 when Danish explorer Vitus Jonassen Bering sighted it on a voyage from Siberia. \n";
        text+="Russian whalers and fur traders on Kodiak Island established the first settlement in Alaska in 1784. \n";
        text+="In 1867 United States Secretary of State William H. Seward offered Russia $7,200,000, or two cents per acre, for Alaska. \n";
        text+="On October 18, 1867 Alaska officially became the property of the United States. Many Americans called the purchase \"Seward's Folly.\" \n";
        text+="Joe Juneau's 1880 discovery of gold ushered in the gold rush era. ";
        textView.setText(text);
    }
    public void showArizonaFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Arizona is a right-to-work state. The law states no person shall be denied the opportunity to obtain or retain employment because of non-membership in a labor organization. \n";
        text+="The Arizona trout is found only in Arizona. \n";
        text+="The saguaro cactus blossom is the official state flower. The white flower blooms on the tips of the saguaro cactus during May and June. The saguaro is the largest American cactus. \n";
        text+="Arizona leads the nation in copper production. \n";
        text+="Petrified wood is the official state fossil. Most petrified wood comes from the Petrified Forest in northeastern Arizona. \n";
        textView.setText(text);
    }
    public void showArkansasFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Elevations in the state range from 54 feet above sea level in the far southeast corner to 2,753 feet above at Mount Magazine, the state's highest point. \n";
        text+="North Little Rock offers one of the nation's largest municipal parks. \n";
        text+="The community of Mountain View is called the Folk Capital of America. The little town preserves the pioneer way of life and puts it on display for visitors at the Ozark Folk Center State Park from March through October. \n";
        text+="The road to the White House for President Bill Clinton began in Hope, then led to Hot Springs, Fayetteville, and Little Rock. \n";
        text+="Arkansas contains over 600,000 acres of lakes and 9,700 miles of streams and rivers. \n";
        textView.setText(text);
    }
    public void showCaliforniaFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="California's Mount Whitney measures as the highest peak in the lower 48 states. Its most famous climb is Mount Whitney Trail to the 14,495 feet summit. Wilderness permits are required. \n";
        text+="More turkeys are raised in California than in any other state in the United States. \n";
        text+="Alpine County is the eighth smallest of California's 58 counties. It has no high school, ATMs, dentists, banks, or traffic lights. \n";
        text+="Fallbrook is known as the Avocado Capital of the World and hosts an annual Avocado Festival. More avocados are grown in the region than any other county in the nation. \n";
        text+="In the late 1850s, Kennedy Mine, located in Jackson, served as one of the richest gold mines in the world and the deepest mine in North America. \n";
        textView.setText(text);
    }
    public void showColoradoFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="\"Beulah red\" is the name of the red marble that gives the Colorado State Capitol its distinctive splendor. Cutting, polishing, and installing the marble in the Capitol took six years, from 1894 to 1900. All of the \"Beulah red\" marble in the world went into the Capitol. It cannot be replaced, at any price. \n";
        text+="Colorado is the only state in history, to turn down the Olympics. In 1976 the Winter Olympics were planned to be held in Denver. 62% of all state Voters choose at almost the last minute not to host the Olympics, because of the cost, pollution and population boom it would have on the State Of Colorado, and the City of Denver. \n";
        text+="The United States Air Force Academy is located in Colorado Springs. \n";
        text+="The world's largest flat-top mountain is in Grand Mesa. \n";
        text+="In Fruita, the town folk celebrate 'Mike the Headless Chicken Day'. Seems that a farmer named L.A. Olsen cut off Mike's head on September 10, 1945 in anticipation of a chicken dinner - and Mike lived for another 4 years without a head. ";
        textView.setText(text);
    }
    public void showConnecticutFacts(View view) {
        TextView textView = (TextView) findViewById(R.id.fact_text_view);
        String text = "The first telephone book ever issued contained only fifty names. The New Haven District Telephone Company published it in New Haven in February 1878. \n";
        text += "The USS Nautilus - the world's first nuclear powered submarine was built in Groton in 1954. \n";
        text += "Connecticut and Rhode Island never ratified the 18th Amendment (Prohibition). \n";
        text += "In 1705, copper was discovered in Simsbury. Later, the copper mine became the infamous New-Gate Prison of the Revolutionary War. Doctor Samuel Higley of Simsbury started the first copper coinage in America in 1737. \n";
        text += "The Scoville Memorial Library is the United States oldest public library. The library collection began in 1771, when Richard Smith, owner of a local blast furnace, used community contributions to buy 200 books in London. Patrons could borrow and return books on the third Monday of every third month. Fees were collected for damages, the most common being \"greasing\" by wax dripped from the candles by which the patrons read. \n";
        textView.setText(text);
    }
    public void showDelawareFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Delaware was the first state to ratify the United States constitution. It did so on December 7, 1787. \n";
        text+="Delaware shares a semi-circular border with Pennsylvania. The border was drawn at the time of the original land grants to William Penn from King Charles II and the Duke of York. \n";
        text+="The nation's first scheduled steam railroad began in New Castle in 1831. \n";
        text+="The United States battleship Delaware was commissioned in 1910. \n";
        text+="Delaware is the only state without any National Park System units such as national parks, seashores, historic sites, battlefields, memorials, and monuments. \n";
        textView.setText(text);
    }
    public void showFloridaFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Greater Miami is the only metropolitan area in the United States whose borders encompass two national parks. You can hike through pristine Everglades National Park or ride on glass-bottom boats across Biscayne National Park. \n";
        text+="Saint Augustine is the oldest European settlement in North America. \n";
        text+="The name Punta Gorda, which means, \"fat point\" when translated from Spanish. The moniker was given to the city because a broad part of the land in Punta Gorda juts into Charlotte Harbor. The harbor itself is somewhat unique, as it is the point where the Peace River meets the ocean. \n";
        text+="Orlando attracts more visitors than any other amusement park destination in the United States. \n";
        text+="New England Congregationalists who sought to bring their style of liberal arts education to the state founded Rollins College, the oldest college in Florida, in Winter Park in 1885. ";
        textView.setText(text);
    }
    public void showGeorgiaFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Okefenokee Swamp encompasses over 400,000 acres of canals; moss draped cypress trees, and lily pad prairies providing sanctuaries for hundreds of species of birds and wildlife including several endangered species. \n";
        text+="Cumberland Island National Seashore contains the ruins of Dungeness, the once magnificent Carnegie estate. In addition, wild horses graze among wind swept dunes. \n";
        text+="The late John F. Kennedy, Jr. and his future wife stopped in Kingsland on the way to their marriage on Cumberland Island. \n";
        text+="Historic Saint Marys Georgia is the second oldest city in the nation. \n";
        text+="The City of Savanna was the first steamship to cross the Atlantic.It sailed from Georgia. \n";
        textView.setText(text);
    }
    public void showHawaiiFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="The state of Hawaii consists of eight main islands: Niihau, Kauai, Oahu, Maui, Molokai, Lanai, Kahoolawe and the Big Island of Hawaii. \n";
        text+="Hawaii is the most isolated population center on the face of the earth. Hawaii is 2,390 miles from California; 3,850 miles from Japan; 4,900 miles from China; and 5,280 miles from the Philippines. \n";
        text+="Hawaii is the only state that grows coffee. \n";
        text+="More than one-third of the world's commercial supply of pineapples comes from Hawaii. \n";
        text+="There are only 12 letters in the Hawaiian alphabet.Vowels: A, E, I, O, U Consonants: H, K, L, M, N, P, W \n";
        textView.setText(text);
    }
    public void showIdahoFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="The Cataldo mission is the oldest building in the state. \n";
        text+="American Falls is unique from most communities because the entire town was moved in the mid-1920s when the original American Falls Dam was constructed. \n";
        text+="Rexburg is home to Ricks College, the largest private two-year college in the nation. \n";
        text+="Elk River is the home of the Idaho Champion Western Red Cedar Tree, the largest tree in the state. Estimated to be over 3000 years old this giant is more than 18 feet in diameter and stands 177 feet tall. \n";
        text+="Albertson College of Idaho in Caldwell was founded as the College of Idaho in 1891 and is the state's oldest four-year institution of higher learning. \n";
        textView.setText(text);
    }
    public void showIllinoisFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Ottawa, Freeport, Jonesboro, Charleston, Galesburg, Quincy and Alton hosted the famous Lincoln-Douglas debates that stirred interest all over the country in the slavery issue. \n";
        text+="The first Aquarium opened in Chicago, 1893. \n";
        text+="The world's first Skyscraper was built in Chicago, 1885. \n";
        text+="Home to the Chicago Bears Football Team, Chicago Blackhawks hockey team, Chicago Bulls basketball team, Chicago Cubs and Chicago Whitesox baseball teams, Chicago Fire soccer team. \n";
        text+="Peoria is the oldest community in Illinois. \n";
        textView.setText(text);
    }
    public void showIndianaFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="The first long-distance auto race in the U. S. was held May 30, 1911, at the Indianapolis Motor Speedway. The winner averaged 75 miles an hour and won a 1st place prize of $14,000. Today the average speed is over 167 miles an hour and the prize is more than $1.2 million. Indianapolis Motor Speedway is the site of the greatest spectacle in sports, the Indianapolis 500. The Indianapolis 500 is held every Memorial Day weekend in the Hoosier capital city. The race is 200 laps or 500 miles long. \n";
        text+="Abraham Lincoln moved to Indiana when he was 7 years old. He lived most of his boyhood life in Spencer County with his parents Thomas and Nancy. \n";
        text+="Explorers Lewis and Clark set out from Fort Vincennes on their exploration of the Northwest Territory. \n";
        text+="During WWII the P-47 fighter-plane was manufactured in Evansville at Republic Aviation. \n";
        text+="Crawfordsville is the home of the only known working rotary jail in the United States. The jail with its rotating cellblock was built in 1882 and served as the Montgomery County jail until 1972. It is now a museum. \n";
        textView.setText(text);
    }
    public void showIowaFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Strawberry Point is the home of the world's largest strawberry. \n";
        text+="The state's smallest city park is situated in the middle of the road in Hiteman. \n";
        text+="Scranton is home to Iowa's oldest water tower still in service. \n";
        text+="Dubuque is the state's oldest city. \n";
        text+="Crystal Lake is home to a statue of the world's largest bullhead fish. \n";
        textView.setText(text);
    }
    public void showKansasFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="A ball of twine in Cawker City measures over 38' in circumference and weighs more than 16,750 pounds and is still growing. \n";
        text+="A grain elevator in Hutchinson is 1/2 mile long and holds 46 million bushels in its 1,000 bins. \n";
        text+="South of Ashland the Rock Island Bridge is the longest railroad bridge of its kind. It measures 1,200 feet long and is 100 feet above the Cimarron River. \n";
        text+="At Kansas State University College of Veterinary Medicine waterbeds for horses are used in surgery. \n";
        text+="Kansas won the award for most beautiful license plate for the wheat plate design issued in 1981. \n";
        textView.setText(text);
    }
    public void showKentuckyFacts(View view) {
        TextView textView = (TextView) findViewById(R.id.fact_text_view);
        String text = "The town of Murray is home to the Boy Scouts of America Scouting Museum located on the campus of Murray State University. \n";
        text += "The Kentucky Derby is the oldest continuously held horse race in the country. It is held at Churchill Downs in Louisville on the first Saturday in May. \n";
        text += "The Bluegrass Country around Lexington is home to some of the world's finest racehorses. \n";
        text += "Kentucky was a popular hunting ground for the Shawnee and Cherokee Indian nations prior to being settled by white settlers. \n";
        text += "In 1774 Harrodstown (now Harrodsburg) was established as the first permanent settlement in the Kentucky region. It was named after James Harrod who led a team of area surveyors. \n";
        textView.setText(text);
    }
    public void showLouisianaFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="The Battle of New Orleans, which made Andrew Jackson a national hero, was fought two weeks after the War of 1812 had ended and more than a month before the news of the war's end had reached Louisiana. \n";
        text+="Louisiana was named in honor of King Louis XIV. \n";
        text+="Baton Rouge hosted the 1983 Special Olympics International Summer Games at LSU. \n";
        text+="Louisiana has the tallest state capitol building in the United States; the building is 450 feet tall with 34 floors. \n";
        text+="Louisiana is the only state with a large population of Cajuns, descendants of the Acadians who were driven out of Canada in the 1700s because they wouldn't pledge allegiance to the King of England. \n";
        textView.setText(text);
    }
    public void showMaineFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Eastport is the most eastern city in the United States. The city is considered the first place in the United States to receive the rays of the morning sun. \n";
        text+="In Wilton there's a cannery that imports and cans only dandelion greens. \n";
        text+="Maine is the only state in the United States whose name has one syllable. \n";
        text+="Maine is the only state that shares its border with only one other state. \n";
        text+="Bath is known as the City of Ships. \n";
        textView.setText(text);
    }
    public void showMarylandFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="The United States Naval Academy was founded on October 10, 1845 at Annapolis. \n";
        text+="In 1830 the Baltimore & Ohio Railroad Company built the first railroad station in Baltimore. \n";
        text+="During revolutionary times Rockville was known as Hungerford's Tavern the name of its most familiar landmark. One of the first calls to freedom from British rule was heard at the tavern in 1774. \n";
        text+="Fort Meade near Laurel became a base because a train engineer delivering soldiers to Meade knew only one Meade, the one in Maryland. He was not aware of Fort Meade, Florida. The confusion happened so often a second base was built in Maryland in an attempt to avoid the confusion. \n";
        text+="King Williams School opened in 1696. It was the first school in the United States. \n";
        textView.setText(text);
    }
    public void showMassachusettsFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Five hundred and fifty two original documents pertaining to the Salem witch trials of 1692 have been preserved and are still stored by the Peabody Essex Museum. \n";
        text+="Boston built the first subway system in the United States in 1897. \n";
        text+="Although over 30 communities in the colonies eventually renamed themselves to honor Benjamin Franklin. The Massachusetts Town of Franklin was the first and changed its name in 1778. \n";
        text+="Norfolk County is the birthplace of four United States presidents: John Adams, John Quincy Adams, John Fitzgerald Kennedy and George Herbert Walker Bush. \n";
        text+="There is a house in Rockport built entirely of newspaper. \n";
        textView.setText(text);
    }
    public void showMichiganFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Detroit is known as the car capital of the world. \n";
        text+="Alpena is the home of the world's largest cement plant. \n";
        text+="Rogers City boasts the world's largest limestone quarry. \n";
        text+="Elsie is the home of the world's largest registered Holstein dairy herd. \n";
        text+="Michigan is first in the United States production of peat and magnesium compounds and second in gypsum and iron ore. \n";
        textView.setText(text);
    }
    public void showMinnesotaFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="The Mall of America in Bloomington is the size of 78 football fields --- 9.5 million square feet. \n";
        text+="Minnesota Inventions: Masking and Scotch tape, Wheaties cereal, Bisquick, HMOs, the bundt pan, Aveda beauty products, and Green Giant vegetables \n";
        text+="The St. Lawrence Seaway opened in 1959 allowing oceangoing ships to reach Duluth. \n";
        text+="Minneapolis is home to the oldest continuously running theater (Old Log Theater) and the largest dinner theater (Chanhassan Dinner Theater) in the country. \n";
        text+="The original name of the settlement that became St. Paul was Pig's Eye. Named for the French-Canadian whiskey trader, Pierre \"Pig's Eye\" Parrant, who had led squatters to the settlement. \n";
        textView.setText(text);
    }
    public void showMississippiFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="In 1963 the University of Mississippi Medical Center accomplished the world's first human lung transplant and, on January 23, 1964, Dr. James D. Hardy performed the world's first heart transplant surgery. \n";
        text+="Borden's Condensed Milk was first canned in Liberty. \n";
        text+="In 1902 while on a hunting expedition in Sharkey County, President Theodore (Teddy) Roosevelt refused to shoot a captured bear. This act resulted in the creation of the world-famous teddy bear. \n";
        text+="The first bottle of Dr. Tichener's Antiseptic was produced in Liberty. \n";
        text+="The world's largest cactus plantation is in Edwards. \n";
        textView.setText(text);
    }
    public void showMissouriFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Missouri is known as the \"Show Me State\". \n";
        text+="The 'Show Me State' expression may have began in 1899 when Congressman Willard Duncan Vandiver stated, \"I'm from Missouri and you've got to show me.\" \n";
        text+="The first successful parachute jump to be made from a moving airplane was made by Captain Berry at St. Louis, in 1912. \n";
        text+="The most destructive tornado on record occurred in Annapolis. In 3 hours, it tore through the town on March 18, 1925 leaving a 980-foot wide trail of demolished buildings, uprooted trees, and overturned cars. It left 823 people dead and almost 3,000 injured. \n";
        text+="At the St. Louis World's Fair in 1904, Richard Blechyden, served tea with ice and invented iced tea. \n";
        textView.setText(text);
    }
    public void showMontanaFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Montana has the largest migratory elk herd in the nation. \n";
        text+="The state boasts the largest breeding population of trumpeter swans in the lower United States. \n";
        text+="At the Rocky Mountain Front Eagle Migration Area west of Great Falls more golden eagles have been seen in a single day than anywhere else in the country. \n";
        text+="North of Missoula is the largest population of nesting common loons in the western United States. \n";
        text+="The average square mile of land contains 1.4 elk, 1.4 pronghorn antelope, and 3.3 deer. \n";
        textView.setText(text);
    }
    public void showNebraskaFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Nebraska was once called \"The Great American Desert\". \n";
        text+="In 1927, Edwin E. Perkins of Hastings invented the powered soft drink Kool-Aid. \n";
        text+="J. Sterling Morton founded Arbor Day in Nebraska City in 1872. \n";
        text+="The state nickname used to be the \"Tree Planter's State\", but was changed in 1945 to the \"Cornhusker State\". \n";
        text+="State insect is the honeybee. \n";
        textView.setText(text);
    }
    public void showNevadaFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="In 1899 Charles Fey invented a slot machine named the Liberty Bell. The device became the model for all slots to follow. \n";
        text+="The Reno Ice Pavilion is a 16,000-square-foot rink once dismantled and moved to Reno from Atlantic City, New Jersey. \n";
        text+="The Imperial Palace on the Las Vegas strip is the nation's first off-airport airline baggage check-in service. \n";
        text+="While Samuel Clemens took the penname \"Mark Twain\" as a reporter working for the \"Territorial Enterprise,\" he began his writing career as a reporter in the Midwest some years before moving to Virginia City in 1862. \n";
        text+="Pershing County located in Cowboy Country features the only round courthouse in the United States. Update: {the Bucks County Courthouse in Pennsylvania, constructed in 1960, is considered round. Now there are two.} \n";
        textView.setText(text);
    }
    public void showNewHampshireFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Of the thirteen original colonies, New Hampshire was the first to declare its independence from Mother England -- a full six months before the Declaration of Independence was signed. \n";
        text+="The highest wind speed recorded at ground level is at Mt. Washington, on April 12, 1934. The winds were three times as fast as those in most hurricanes. \n";
        text+="New Hampshire is the only state that ever played host at the formal conclusion of a foreign war. In 1905, Portsmouth was the scene of the treaty ending the Russo-Japanese War. \n";
        text+="The first potato planted in the United States was at Londonderry Common Field in 1719. \n";
        text+="Alan Bartlett Shepard Jr., the first American to travel in space is from East Derry, New Hampshire. \n";
        textView.setText(text);
    }
    public void showNewJerseyFacts(View view) {
        TextView textView = (TextView) findViewById(R.id.fact_text_view);
        String text = "New Jersey has the highest population density in the U.S. An average 1,030 people per sq. mi., which is 13 times the national average. \n";
        text += "New Jersey has the highest percent urban population in the U.S. with about 90% of the people living in an urban area. \n";
        text += "In November of 1914, the New York Tribune, cooperating with Mr. Bertram Chapman Mayo (founder of Beachwood) issued an \"Extra\" announcing: \"Subscribe to the New York Tribune and secure a lot at Beautiful Beachwood. Act at once, secure your lot in this Summer Paradise now!\" This was the greatest premium offered by a newspaper - nothing equal to it was ever attempted in the United States. \n";
        text += "New Jersey is the only state where all its counties are classified as metropolitan areas. \n";
        text += "New Jersey has the most dense system of highways and railroads in the U.S. \n";
        textView.setText(text);
    }
    public void showNewMexicoFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Santa Fe is the highest capital city in the United States at 7,000 feet above sea level. \n";
        text+="The province that was once Spanish New Mexico included all of present day New Mexico, most of Colorado and Arizona, and slices of Utah, Texas, Oklahoma, Kansas and Wyoming. The Original American Territory of New Mexico that congress created in 1850 included all of New Mexico and Arizona plus parts of Colorado, Nevada, and Utah. The boundaries of present day New Mexico were drawn by congress in 1863 but New Mexico didn't become a state until 1912. \n";
        text+="Each October Albuquerque hosts the world's largest international hot air balloon fiesta. \n";
        text+="Lakes and Rivers make up only .002% of the state's total surface area. The lowest water-to-land ratio of all 50 states. Most of New Mexico's lakes are man-made reservoirs. A dam on the Rio Grande formed the Elephant Butte Reservoir the state's largest lake. \n";
        text+="The Rio Grande is New Mexico's longest river and runs the entire length of New Mexico. \n";
        textView.setText(text);
    }
    public void showNewYorkFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="The first American chess tournament was held in New York in 1843. \n";
        text+="The 641 mile transportation network known as the Governor Thomas E. Dewey Thruway is the longest toll road in the United States. \n";
        text+="A brewer named Matthew Vassar founded Vassar College in Poughkeepsie in 1861. \n";
        text+="In 1979 Vassar students were the first from a private college to be granted permission to study in the People's Republic of China. \n";
        text+="The Fashion Institute of Technology in Manhattan is the only school in the world offering a Bachelor of Science Degree with a Major in Cosmetics and Fragrance Marketing. \n";
        textView.setText(text);
    }
    public void showNorthCarolinaFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="The University of North Carolina Chapel Hill is the oldest State University in the United States. \n";
        text+="In 1903 the Wright Brothers made the first successful powered flight by man at Kill Devil Hill near Kitty Hawk. The Wright Memorial at Kitty Hawks now commemorates their achievement. \n";
        text+="High Point is known as the Furniture Capital of the World. \n";
        text+="Known as \"Fish Town\" in the early 1700's when Blackbeard frequented the coast, \"Beaufort Town\" was established as a seaport with the right to collect customs, in 1722. \n";
        text+="The Outer Banks of NC hosts some of the most beautiful beaches in the country. \n";
        textView.setText(text);
    }
    public void showNorthDakotaFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="The town of Rugby is the geographical center of North America. A rock obelisk about 15 feet tall, flanked by poles flying the United States and Canadian flags marks the location. \n";
        text+="North Dakota passed a bill in 1987 making English the official state language. \n";
        text+="Milk is the official state beverage. \n";
        text+="Westhope located on U.S. Highway 83 is a Port-of-Entry into Canada. Each year more than 72,000 vehicles cross the border at this point. \n";
        text+="An attempt to drop the word North from the state name was defeated by the 1947 Legislative Assembly. Again in 1989 the Legislature rejected two resolutions intended to rename the state Dakota. \n";
        textView.setText(text);
    }
    public void showOhioFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="The first ambulance service was established in Cincinnati in 1865. \n";
        text+="Cleveland boasts America's first traffic light. It began on Aug. 5, 1914. \n";
        text+="James J. Ritty, of Dayton, invented the cash register in 1879 to stop his patrons from pilfering house profits. \n";
        text+="Akron was the first city to use police cars. \n";
        text+="Cincinnati had the first professional city fire department. \n";
        textView.setText(text);
    }
    public void showOklahomaFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="On July 25, 2000, Governor Keating announced plans to construct a dome on the Oklahoma State Capitol Building. Construction was slated to begin in April 2001 with an estimated completion date of November 2002. \n";
        text+="The world's first installed parking meter was in Oklahoma City, on July 16, 1935. Carl C. Magee, of Oklahoma City, Oklahoma, is generally credited with originating the parking meter. He filed for a patent for a \"coin controlled parking meter\" on May 13, 1935. \n";
        text+="Vinita is the oldest incorporated town on Oklahoma Route 66 being established in 1871. Vinita was the first town in Oklahoma to enjoy electricity. It was originally named Downingville. The towns name was later changed to Vinita, in honor of Vinnie Ream, the sculptress who created the life-size statue of Lincoln at the United States Capitol. \n";
        text+="During a tornado in Ponca City, a man and his wife were carried aloft in their house by a tornado. The walls and roof were blown away. But the floor remained intact and eventually glided downward, setting the couple safely back on the ground. \n";
        text+="The Amateur Softball Association of America - a volunteer-driven, not-for-profit organization based in Oklahoma City, OK - was founded in 1933 and has evolved into the strongest softball organization in the country. \n";
        textView.setText(text);
    }
    public void showOregonFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Oregon's state flag pictures a beaver on its reverse side. It is the only state flag to carry two separate designs. \n";
        text+="The Columbia River gorge is considered by many to be the best place in the world for windsurfing. \n";
        text+="Crater Lake is the deepest lake in the United States and is formed in the remains of an ancient volcano. \n";
        text+="Oregon and New Jersey are the only states without self-serve gas stations. \n";
        text+="Eugene was the first city to have one-way streets. \n";
        textView.setText(text);
    }
    public void showPennsylvaniaFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Pennsylvania is the first state of the fifty United States to list their web site URL on a license plate. \n";
        text+="In 1909 the first baseball stadium was built in Pittsburgh. \n";
        text+="Hershey is considered the Chocolate Capital of the United States. \n";
        text+="In 1913 the first automobile service station opened in Pittsburgh. \n";
        text+="In 1946 Philadelphia became home to the first computer. \n";
        textView.setText(text);
    }
    public void showRhodeIslandFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Rhode Island is the smallest state in size in the United States. It covers an area of 1,214 square miles. Its distances North to South are 48 miles and East to West 37 miles. \n";
        text+="Rhode Island was the last of the original thirteen colonies to become a state. \n";
        text+="Rhode Island shares a state water border with New York. \n";
        text+="The Cogswell Tower in Central Falls was the site of an Indian observation point in use during King Phillips War in 1676. The tower was built in 1904 as part of the last will and testament of Caroline Cogswell. \n";
        text+="Judge Darius Baker imposed the first jail sentence for speeding in an automobile on August 28, 1904 in Newport. \n";
        textView.setText(text);
    }
    public void showSouthCarolinaFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Campbell's Covered Bridge built in 1909, is the only remaining covered bridge in South Carolina. It is off Hwy 14 near Gowensville. \n";
        text+="The salamander was given the honor of official state amphibian. \n";
        text+="The walls of the American fort on Sullivan Island, in Charleston Harbor, were made of spongy Palmetto logs. This was helpful in protecting the fort because the British cannonballs bounced off the logs. \n";
        text+="The City of Myrtle Beach is in the center of the Grand Strand, a 60-mile crescent of beach on the South Carolina coast. In the last 25 years, Myrtle Beach has developed into the premier resort destination on the East Coast. \n";
        text+="South Carolina entered the Union on May 23, 1788 and became the 8th state. \n";
        textView.setText(text);
    }
    public void showSouthDakotaFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Sculptor Gutzon Borglum began drilling into the 6,200-foot Mount Rushmore in 1927. Creation of the Shrine to Democracy took 14 years and cost a mere $1 million, though it's now deemed priceless. \n";
        text+="The faces of George Washington, Thomas Jefferson, Theodore Roosevelt, and Abraham Lincoln are sculpted into Mount Rushmore. It is the world's greatest mountain carving. \n";
        text+="Perhaps the most significant fur trade/military fort on the western American frontier, Fort Pierre Chouteau was the largest (almost 300' square) and best equipped trading post in the northern Great Plains. Built in 1832 by John Jacob Astor's (1763-1848) American Fur Company as part of its expansion into the Upper Missouri region, the trading activities at the site exemplified the commercial alliance critical to the success of the fur business. \n";
        text+="Jack McCall was tried, convicted and hanged two miles north of Yankton in 1877 for the shooting of Wild Bill Hickok. He is buried in an unmarked grave in the Yankton cemetery. \n";
        text+="The site of a rich gold strike in 1875, Deadwood retains its mining town atmosphere. While Deadwood is one of the most highly publicized mining towns of the trans-Mississippi West, much of its fame rests on the famous or infamous characters that passed through. \n";
        textView.setText(text);
    }
    public void showTennesseeFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="The city of Kingston served as Tennessee's state capital for one day (September 21, 1807) as a result of treaties negotiated with the Cherokee Indians. The two-hour legislative session passed two resolutions and adjourned back to Knoxville. \n";
        text+="Andrew Johnson held every elective office at the local, state, and federal level, including President of the United States. He was elected alderman, mayor, state representative, and state senator from Greeneville. He served as governor and military governor of Tennessee and United States congressman, senator, and vice president, becoming President of the United States following the assassination of Abraham Lincoln. \n";
        text+="Iroquois, bred at Nashville's Belle Meade Plantation, was the first American winner of the English Derby in 1881. Such modern thoroughbreds as Secretariat trace their bloodlines to Iroquois. \n";
        text+="Tennessee won its nickname as The Volunteer State during the War of 1812 when volunteer soldiers from Tennessee displayed marked valor in the Battle of New Orleans. \n";
        text+="The Copper Basin is so different from the surrounding area it has been seen and is recognizable by American astronauts. The stark landscape was caused by 19th-century mining practices. \n";
        textView.setText(text);
    }
    public void showTexasFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Texas is popularly known as The Lone Star State. \n";
        text+="The Alamo is located in San Antonio. It is where Texas defenders fell to Mexican General Santa Anna and the phrase Remember the Alamo originated. The Alamo is considered the cradle of Texas liberty and the state's most popular historic site. \n";
        text+="The lightning whelk is the official state shell. \n";
        text+="Texas is the only state to have the flags of 6 different nations fly over it. They are: Spain, France, Mexico, Republic of Texas, Confederate States, and the United States. \n";
        text+="Although six flags have flown over Texas, there have been eight changes of government: Spanish 1519-1685, French 1685-1690, Spanish 1690-1821, Mexican 1821-1836, Republic of Texas 1836-1845, United States 1845-1861, Confederate States 1861-1865, United States 1865-present \n";
        textView.setText(text);
    }
    public void showUtahFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Completion of the world's first transcontinental railroad was celebrated at Promontory where the Central Pacific and Union Pacific Railroads met on May 10, 1869. It is now known as Golden Spike National Historic Site \n";
        text+="Utah is the site of the nations first department store. Zions Co-operative Mercantile Institution was established in the late 1800's. It is still in operation today as ZCMI. \n";
        text+="Interstate 70 enters the eastern edge of the state, from Grand Junction Colorado, and ends where it intersects Interstate 15, near Cove Fort. This section of Interstate 70 is one of the most deserted stretches of Interstate in the United States. \n";
        text+="The Great Salt Lake covers 2,100 square miles, with an average depth of 13 feet. The deepest point is 34 feet. \n";
        text+="The average snowfall in the mountains near Salt Lake City is 500 inches. \n";
        textView.setText(text);
    }
    public void showVermontFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Vermont was the first state admitted to the Union after the ratification of the Constitution. \n";
        text+="With a population of fewer than nine thousand people, Montpelier, Vermont is the smallest state capital in the U.S. \n";
        text+="In ratio of cows to people, Vermont has the greatest number of dairy cows in the country. \n";
        text+="Montpelier is the largest producer of maple syrup in the U.S. \n";
        text+="Until recently, the only way a Vermonter could get a drivers license with their photo on it was to drive to Montpelier. \n";
        textView.setText(text);
    }
    public void showVirginiaFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="The major cash crop of Virginia is tobacco and many of the people who live there earn their living from the tobacco industry. \n";
        text+="Jamestown, the first of the original 13 Colonies was founded for the purpose of silk cultivation. Silk to be traded with the Court of King James. After blight fungus destroyed the mulberry trees (silkworm food), sericulturist planted tobacco as a cash crop. \n";
        text+="Jamestown was the first English settlement in the U.S. It was also the first capital of Virginia. \n";
        text+="Virginia is known as \"the birthplace of a nation\". \n";
        text+="Arlington County was originally part of the ten-mile square parcel of land surveyed in 1791 to be part of Washington, DC. The U.S. Congress returned that portion of the land to the \"Commonwealth of Virginia\" following a referendum among its citizens. \n";
        textView.setText(text);
    }
    public void showWashingtonFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="The state of Washington is the only state to be named after a United States president. \n";
        text+="Washington state produces more apples than any other state in the union. \n";
        text+="Washington state has more glaciers than the other 47 contiguous states combined. \n";
        text+="Washington state's capitol building was the last state capitol building to be built with a rotunda. \n";
        text+="Everett is the site of the world's largest building, Boeing's final assembly plant \n";
        textView.setText(text);
    }
    public void showWestVirginiaFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="West Virginia is the only state in the Union to have acquired its sovereignty by proclamation of the President of the United States. \n";
        text+="West Virginia is considered the southern most northern state and the northern most southern state. \n";
        text+="West Virginia has the oldest population of any state. The median age is 40. \n";
        text+="The world's largest sycamore tree is located on the Back Fork of the Elk River in Webster Springs. \n";
        text+="The first state sales tax in the United States went into effect in West Virginia on July 1, 1921. \n";
        textView.setText(text);
    }
    public void showWisconsinFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Wisconsin visitors and residents enjoy the state's 7,446 streams and rivers. End-to-end they'd stretch 26,767 miles. That is more than enough to circle the globe at the equator. \n";
        text+="Wisconsin's Door County has five state parks and 250 miles of shoreline along Lake Michigan. These figures represent more than any other county in the country. \n";
        text+="In 1878-1879 the Wisconsin legislature approved the creation of a state park in Vilas County. The proposal was not successful and the state ended up selling two-thirds of area land to lumber interest for $8 an acre in 1897. \n";
        text+="In 1900 land acquisition for Wisconsin's first state park began. The park became Interstate State Park located in St. Croix Falls. \n";
        text+="The state is nicknamed the Badger State. \n";
        textView.setText(text);
    }
    public void showWyomingFacts(View view){
        TextView textView=(TextView)findViewById(R.id.fact_text_view);
        String text="Wyoming's license plates feature a man on a bucking bronco. \n";
        text+="Wyoming was the first state to give women the right to vote. \n";
        text+="Yellowstone is the first official National Park (1872) \n";
        text+="Devils Tower was designated as the first National Monument (1906) \n";
        text+="The first coal mine in Wyoming was in Carbon in 1867 \n";
        textView.setText(text);
    }
}
