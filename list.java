
package classess;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JPanel;
public class list extends JPanel{
  list(){
    GridLayout layout = new GridLayout(10,1);
    layout.setVgap(5);
    
    this.setLayout(layout);
    //this.setBackground(Color.blue);
 }
  public void updateNumbers()
  {
    Component[] listItems = this.getComponents();

    for(int i=0;i< listItems.length;i++)
      {
        if(listItems[i] instanceof Task)
        {
          ((Task)listItems[i]).changeIndex(i+1);
        }
      }
  }
}
