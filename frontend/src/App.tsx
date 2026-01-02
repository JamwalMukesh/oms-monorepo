import {  Typography } from "@mui/material"
import CreateOrderPage from "./pages/CreateOrderPage"

function App() {
  
  return (
    <div style={{padding: 20}}>
      <Typography variant="h4" color="primary">
        Order Management System
      </Typography>
      <CreateOrderPage />
    </div>
  )
}

export default App
