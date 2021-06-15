import React, { memo } from 'react'
import { Grid, GridColumn, GridRow } from 'semantic-ui-react'
import Section from './Section'
import Slidebar from './Slidebar'

export default memo(function Dashboard() {
    return (
        <div>
            <Grid>
                <GridRow>
                    <GridColumn width={4}>
                        <Slidebar />
                    </GridColumn>
                    <GridColumn width = {12}>
                       <Section/>

                    </GridColumn>







                </GridRow>
            </Grid>
        </div>
    )
})
