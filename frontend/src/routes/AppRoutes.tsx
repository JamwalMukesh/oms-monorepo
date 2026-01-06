import { Routes, Route, Navigate } from "react-router-dom";
import OrderPage from "../pages/OrderPage";
import NotFoundPage from "../pages/NotFoundPage";

export default function AppRoutes() {
  return (
    <Routes>
      <Route path="/" element={<Navigate to="/orders" />} />
      <Route path="/orders" element={<OrderPage />} />
      <Route path="*" element={<NotFoundPage />} />
    </Routes>
  );
}