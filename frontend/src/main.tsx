import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import { ThemeProvider } from '@mui/material/styles'
import theme from './theme/theme.ts'
import { CssBaseline } from '@mui/material'
import App from './App.tsx'

createRoot(document.getElementById('root')!).render(
  <StrictMode>
    <ThemeProvider theme={theme}>
      <CssBaseline />
      <App/>
    </ThemeProvider>
  </StrictMode>,
)
