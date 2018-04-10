package bagusandinata.tablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.viewPager_id);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFragment(new OneFragment(), "ITEM ONE");
        viewPagerAdapter.addFragment(new TwoFragment(), "ITEM TWO");
        viewPagerAdapter.addFragment(new ThreeFragment(), "ITEM THREE");

        viewPager.setAdapter(viewPagerAdapter);

        tabLayout = findViewById(R.id.tabLayout_id);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.phone);
        tabLayout.getTabAt(1).setIcon(R.drawable.account);
        tabLayout.getTabAt(2).setIcon(R.drawable.heart);

    }
}
