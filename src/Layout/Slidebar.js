import React, { memo } from 'react'
import { Menu } from 'semantic-ui-react'
export default memo(function Slidebar() {
    return (
        <div>
                  <Menu pointing  vertical className = "menu">
        <Menu.Item
          name='JobAdverts'
        
        />
        <Menu.Item
          name='JopPositions'
    
        />
        <Menu.Item
          name='Emplooyes'
  
        />
            <Menu.Item
          name='Emplooyers'
  
        />
              <Menu.Item
          name='Curriculium Vitaes'
  
        />
      </Menu>
            
        </div>
    )
})
