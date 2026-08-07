package com.example.ui

import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.togetherWith
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Map
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.ContentCut
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PhotoLibrary
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.EventAvailable
import androidx.compose.material.icons.filled.ReceiptLong
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.LightMode
import androidx.compose.material.icons.outlined.NightsStay
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.WbSunny
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.material.icons.filled.Badge
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Login
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material.icons.filled.PersonAdd
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AdminPanelSettings
import androidx.compose.material.icons.filled.AttachMoney
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Group
import androidx.compose.material.icons.filled.LocalOffer
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.TrendingUp
import androidx.compose.material.icons.filled.PointOfSale
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.theme.CharcoalBg
import com.example.ui.theme.CharcoalBorder
import com.example.ui.theme.CharcoalCard
import com.example.ui.theme.CharcoalCardLight
import com.example.ui.theme.CharcoalSurface
import com.example.ui.theme.TextBlack
import com.example.ui.theme.TextGray
import com.example.ui.theme.TextWhite
import com.example.ui.theme.YellowAmber
import com.example.ui.theme.YellowGold
import com.example.ui.theme.YellowGradient
import com.example.ui.theme.YellowBright

// Data class representing a date option
data class BarberDateOption(
    val id: String,
    val dayOfWeek: String,
    val dayNumber: String,
    val month: String,
    val fullFormatted: String,
    val badgeLabel: String? = null
)

// Data class representing a time shift / turn
data class BarberTimeShift(
    val title: String,
    val subtitle: String,
    val icon: ImageVector,
    val slots: List<String>
)

@OptIn(ExperimentalLayoutApi::class)
enum class DrawerDestination {
    AGENDA,
    FEED,
    SERVICES,
    BARBERS,
    MY_BOOKINGS,
    PROFILE,
    LOCATION,
    ADMIN_PANEL
}

data class CouponItem(
    val id: String,
    val code: String,
    val discountPercent: Int = 0,
    val discountFixed: Double = 0.0,
    val isPercentage: Boolean = true,
    val maxUses: Int = 100,
    val usesCount: Int = 0,
    val isActive: Boolean = true
)

data class TeamBarberItem(
    val id: String,
    val name: String,
    val role: String,
    val phone: String,
    val isActive: Boolean = true,
    val completedAppointments: Int = 0,
    val totalRevenue: Double = 0.0
)

data class OperatingScheduleItem(
    val id: String,
    val dayOfWeek: String,
    val isOpen: Boolean,
    val openTime: String,
    val closeTime: String
)

data class AdminSettings(
    val shopName: String = "Barbearia Jadson Barber",
    val phone: String = "(11) 99999-8888",
    val pixKey: String = "jadsonbarber@pix.com.br",
    val address: String = "Rua do Estilo, 123 - Centro",
    val autoApproveBookings: Boolean = true,
    val adminPin: String = "1234"
)

data class UserAccount(
    val fullName: String,
    val phone: String,
    val email: String? = null,
    val password: String,
    val clientCode: String
)

fun generateClientCode(): String {
    val digits = (100..999).random().toString()
    val letter = ('A'..'Z').random().toString()
    return "$digits$letter"
}

data class ConfirmedBooking(
    val id: String,
    val date: BarberDateOption,
    val time: String,
    val barber: String,
    val services: List<BarberService>,
    val totalPrice: Double,
    val status: String = "Confirmado",
    val clientCode: String? = null,
    val clientName: String? = null
)

@Composable
fun SchedulingScreen(
    modifier: Modifier = Modifier
) {
    // Generate dates starting from today
    val dates = remember {
        listOf(
            BarberDateOption("1", "QUI", "06", "AGO", "Quinta-feira, 06/08", "Hoje"),
            BarberDateOption("2", "SEX", "07", "AGO", "Sexta-feira, 07/08", "Amanhã"),
            BarberDateOption("3", "SÁB", "08", "AGO", "Sábado, 08/08"),
            BarberDateOption("4", "DOM", "09", "AGO", "Domingo, 09/08"),
            BarberDateOption("5", "SEG", "10", "AGO", "Segunda-feira, 10/08"),
            BarberDateOption("6", "TER", "11", "AGO", "Terça-feira, 11/08"),
            BarberDateOption("7", "QUA", "12", "AGO", "Quarta-feira, 12/08"),
            BarberDateOption("8", "QUI", "13", "AGO", "Quinta-feira, 13/08"),
            BarberDateOption("9", "SEX", "14", "AGO", "Sexta-feira, 14/08"),
            BarberDateOption("10", "SÁB", "15", "AGO", "Sábado, 15/08")
        )
    }

    // Time slots separated by turns / shifts
    val shifts = remember {
        listOf(
            BarberTimeShift(
                title = "Manhã",
                subtitle = "08:00 - 11:30",
                icon = Icons.Outlined.WbSunny,
                slots = listOf("08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30")
            ),
            BarberTimeShift(
                title = "Tarde",
                subtitle = "13:00 - 17:30",
                icon = Icons.Outlined.LightMode,
                slots = listOf("13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30")
            ),
            BarberTimeShift(
                title = "Noite",
                subtitle = "18:00 - 20:00",
                icon = Icons.Outlined.NightsStay,
                slots = listOf("18:00", "18:30", "19:00", "19:30", "20:00")
            )
        )
    }

    val allServices = remember {
        listOf(
            BarberService("1", "Corte de Cabelo", "Degradê, social, militar ou tesoura com lavagem", 45.0, 30, isPopular = true),
            BarberService("2", "Barba Completa", "Toalha quente, alinhamento com navalha e pós-barba", 35.0, 20, isPopular = true),
            BarberService("3", "Pezinho / Acabamento", "Alinhamento do contorno do cabelo e nuca", 20.0, 15),
            BarberService("4", "Sobrancelha", "Design e limpeza com navalha ou tesoura", 15.0, 10),
            BarberService("5", "Hidratação Capilar", "Tratamento profundo com produtos premium", 35.0, 20),
            BarberService("6", "Pigmentação", "Disfarce de falhas no cabelo ou barba com realce de cor", 40.0, 25),
            BarberService("7", "Combo Corte + Barba", "Atendimento completo cabelo + barba com desconto", 70.0, 50, isPopular = true)
        )
    }

    var selectedDate by remember { mutableStateOf(dates.first()) }
    var selectedTime by remember { mutableStateOf<String?>(null) }
    var selectedTimeForBarber by remember { mutableStateOf<String?>(null) }
    var selectedBarber by remember { mutableStateOf<String?>(null) }
    var selectedServicesForSummary by remember { mutableStateOf<List<BarberService>?>(null) }
    var isMenuOpen by remember { mutableStateOf(false) }
    var activeDestination by remember { mutableStateOf(DrawerDestination.AGENDA) }
    var registeredUsers by remember {
        mutableStateOf(
            listOf(
                UserAccount(
                    fullName = "Carlos Eduardo",
                    phone = "(11) 98888-7777",
                    email = "carlos@gmail.com",
                    password = "123",
                    clientCode = "482K"
                )
            )
        )
    }
    var currentUser by remember { mutableStateOf<UserAccount?>(null) }
    var showAuthDialog by remember { mutableStateOf(false) }
    var pendingBookingAction by remember { mutableStateOf(false) }
    var pendingDestinationAfterAuth by remember { mutableStateOf<DrawerDestination?>(null) }

    var confirmedBookings by remember {
        mutableStateOf(
            listOf(
                ConfirmedBooking(
                    id = "sample-1",
                    date = dates[1],
                    time = "15:00",
                    barber = "Jadson Barber",
                    services = listOf(
                        BarberService("1", "Corte de Cabelo", "Degradê, social, militar ou tesoura com lavagem", 45.0, 30, isPopular = true),
                        BarberService("2", "Barba Completa", "Toalha quente, alinhamento com navalha e pós-barba", 35.0, 20, isPopular = true)
                    ),
                    totalPrice = 80.0,
                    status = "Confirmado",
                    clientCode = "482K",
                    clientName = "Carlos Eduardo"
                )
            )
        )
    }

    var couponsList by remember {
        mutableStateOf(
            listOf(
                CouponItem("c1", "JADSON10", discountPercent = 10, isPercentage = true, maxUses = 50, usesCount = 12, isActive = true),
                CouponItem("c2", "BARBA20", discountFixed = 15.0, isPercentage = false, maxUses = 30, usesCount = 8, isActive = true),
                CouponItem("c3", "VIPJADSON", discountPercent = 15, isPercentage = true, maxUses = 100, usesCount = 35, isActive = true)
            )
        )
    }

    var teamBarbers by remember {
        mutableStateOf(
            listOf(
                TeamBarberItem("b1", "Jadson Barber", "Master Barber & Proprietário", "(11) 99999-8888", isActive = true, completedAppointments = 48, totalRevenue = 2160.0),
                TeamBarberItem("b2", "Maycon Silva", "Especialista em Degradê & Fade", "(11) 97777-6666", isActive = true, completedAppointments = 32, totalRevenue = 1440.0)
            )
        )
    }

    var operatingSchedules by remember {
        mutableStateOf(
            listOf(
                OperatingScheduleItem("s1", "Segunda-feira", isOpen = false, openTime = "08:00", closeTime = "18:00"),
                OperatingScheduleItem("s2", "Terça-feira", isOpen = true, openTime = "08:00", closeTime = "20:00"),
                OperatingScheduleItem("s3", "Quarta-feira", isOpen = true, openTime = "08:00", closeTime = "20:00"),
                OperatingScheduleItem("s4", "Quinta-feira", isOpen = true, openTime = "08:00", closeTime = "20:00"),
                OperatingScheduleItem("s5", "Sexta-feira", isOpen = true, openTime = "08:00", closeTime = "20:00"),
                OperatingScheduleItem("s6", "Sábado", isOpen = true, openTime = "08:00", closeTime = "20:00"),
                OperatingScheduleItem("s7", "Domingo", isOpen = true, openTime = "07:00", closeTime = "12:00")
            )
        )
    }

    var feedPosts by remember {
        mutableStateOf(
            listOf(
                FeedPostItem("p1", "Jadson Barber", "Master Barber", "Há 2 horas", "Degradê Navalhado + Barba Terapia", "Corte degradê ultra limpo com acabamento na navalha e hidratação de barba com toalha quente.", "Degradê", listOf("Degradê", "Navalhado", "Barba"), 24, false),
                FeedPostItem("p2", "Maycon Silva", "Especialista em Fade", "Há 1 dia", "Americano Taper Fade com Risco", "Estilo moderno americano taper fade com risca lateral personalizada e alinhamento de pezinho.", "Taper Fade", listOf("Americano", "Risca", "Fade"), 38, true),
                FeedPostItem("p3", "Jadson Barber", "Master Barber", "Há 3 dias", "Barba Alinhada + Pigmentação Premium", "Design de barba alinhado com navalha e pigmentação sutil para disfarce de falhas com aspecto natural.", "Pigmentação", listOf("Barba", "Pigmentação", "ToalhaQuente"), 45, false)
            )
        )
    }

    var adminSettings by remember { mutableStateOf(AdminSettings()) }
    val context = LocalContext.current

    val scrollState = rememberScrollState()

    // PREVENT SCREEN LOCK WITH BACK BUTTON HANDLERS
    BackHandler(enabled = isMenuOpen) {
        isMenuOpen = false
    }

    BackHandler(enabled = !isMenuOpen && activeDestination != DrawerDestination.AGENDA) {
        activeDestination = DrawerDestination.AGENDA
    }

    Surface(
        modifier = modifier.fillMaxSize(),
        color = CharcoalBg
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            // FIXED HEADER AT TOP FOR ALL SCREENS (NEVER OVERLAPPED BY MENU)
            Surface(
                color = CharcoalBg,
                tonalElevation = 6.dp,
                shape = RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .statusBarsPadding()
                            .padding(horizontal = 20.dp, vertical = 16.dp)
                    ) {
                        HeaderSection(
                            isMenuOpen = isMenuOpen,
                            currentUser = currentUser,
                            onMenuToggle = { isMenuOpen = !isMenuOpen },
                            onOpenAuth = { showAuthDialog = true }
                        )
                    }

                    // ANIMATED YELLOW GRADIENT BORDER
                    AnimatedGradientHeaderBorder()
                }
            }

            // BODY AREA WITH LEFT DRAWER SLIDING BELOW HEADER
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                // CURRENT SCREEN CONTENT BASED ON MENU DESTINATION OR SCHEDULING FLOW WITH FLUID TRANSITIONS
                AnimatedContent(
                    targetState = activeDestination,
                    transitionSpec = {
                        (fadeIn(animationSpec = tween(250, easing = FastOutSlowInEasing)) +
                                slideInHorizontally(animationSpec = tween(250, easing = FastOutSlowInEasing)) { width -> width / 6 })
                            .togetherWith(
                                fadeOut(animationSpec = tween(200, easing = FastOutSlowInEasing)) +
                                        slideOutHorizontally(animationSpec = tween(200, easing = FastOutSlowInEasing)) { width -> -width / 6 }
                            )
                    },
                    label = "ActiveDestinationTransition",
                    modifier = Modifier.fillMaxSize()
                ) { destination ->
                    when (destination) {
                        DrawerDestination.FEED -> {
                            FeedScreen(
                                onSelectStyleToSchedule = { styleTitle ->
                                    activeDestination = DrawerDestination.AGENDA
                                    Toast.makeText(context, "Agende seu horário para o estilo: $styleTitle", Toast.LENGTH_SHORT).show()
                                }
                            )
                        }
                        DrawerDestination.SERVICES -> {
                            ServicesListScreen(
                                onSelectServiceToSchedule = {
                                    activeDestination = DrawerDestination.AGENDA
                                }
                            )
                        }
                        DrawerDestination.BARBERS -> {
                            BarbersListScreen(
                                onSelectBarberToSchedule = { barberName ->
                                    selectedBarber = barberName
                                    activeDestination = DrawerDestination.AGENDA
                                }
                            )
                        }
                        DrawerDestination.MY_BOOKINGS -> {
                            MyBookingsScreen(
                                bookings = confirmedBookings,
                                dates = dates,
                                shifts = shifts,
                                allServices = allServices,
                                onNewBookingClick = {
                                    activeDestination = DrawerDestination.AGENDA
                                },
                                onUpdateBooking = { updatedBooking ->
                                    confirmedBookings = confirmedBookings.map { if (it.id == updatedBooking.id) updatedBooking else it }
                                },
                                onCancelBooking = { bookingId ->
                                    confirmedBookings = confirmedBookings.filter { it.id != bookingId }
                                    Toast.makeText(context, "Agendamento cancelado.", Toast.LENGTH_SHORT).show()
                                }
                            )
                        }
                        DrawerDestination.LOCATION -> {
                            LocationScreen(
                                context = context
                            )
                        }
                        DrawerDestination.PROFILE -> {
                            ProfileScreen(
                                currentUser = currentUser,
                                confirmedBookings = confirmedBookings,
                                onOpenAuth = { showAuthDialog = true },
                                onLogout = {
                                    currentUser = null
                                    Toast.makeText(context, "Sessão encerrada com sucesso.", Toast.LENGTH_SHORT).show()
                                },
                                onNavigateToBookings = { activeDestination = DrawerDestination.MY_BOOKINGS },
                                onNavigateToAgenda = { activeDestination = DrawerDestination.AGENDA }
                            )
                        }
                        DrawerDestination.ADMIN_PANEL -> {
                            AdminPanelScreen(
                                confirmedBookings = confirmedBookings,
                                registeredUsers = registeredUsers,
                                allServices = allServices,
                                teamBarbers = teamBarbers,
                                couponsList = couponsList,
                                operatingSchedules = operatingSchedules,
                                feedPosts = feedPosts,
                                adminSettings = adminSettings,
                                onUpdateBookings = { confirmedBookings = it },
                                onUpdateUsers = { registeredUsers = it },
                                onUpdateTeamBarbers = { teamBarbers = it },
                                onUpdateCoupons = { couponsList = it },
                                onUpdateOperatingSchedules = { operatingSchedules = it },
                                onUpdateFeedPosts = { feedPosts = it },
                                onUpdateAdminSettings = { adminSettings = it },
                                onBackToApp = { activeDestination = DrawerDestination.AGENDA }
                            )
                        }
                        DrawerDestination.AGENDA -> {
                            val currentServices = selectedServicesForSummary
                            val currentBarber = selectedBarber
                            val currentTime = selectedTimeForBarber

                            val agendaStep = when {
                                currentServices != null && currentBarber != null && currentTime != null -> 4
                                currentBarber != null && currentTime != null -> 3
                                currentTime != null -> 2
                                else -> 1
                            }

                            AnimatedContent(
                                targetState = agendaStep,
                                transitionSpec = {
                                    if (targetState > initialState) {
                                        (fadeIn(animationSpec = tween(250, easing = FastOutSlowInEasing)) +
                                                slideInHorizontally(animationSpec = tween(250, easing = FastOutSlowInEasing)) { width -> width / 4 })
                                            .togetherWith(
                                                fadeOut(animationSpec = tween(200, easing = FastOutSlowInEasing)) +
                                                        slideOutHorizontally(animationSpec = tween(200, easing = FastOutSlowInEasing)) { width -> -width / 4 }
                                            )
                                    } else {
                                        (fadeIn(animationSpec = tween(250, easing = FastOutSlowInEasing)) +
                                                slideInHorizontally(animationSpec = tween(250, easing = FastOutSlowInEasing)) { width -> -width / 4 })
                                            .togetherWith(
                                                fadeOut(animationSpec = tween(200, easing = FastOutSlowInEasing)) +
                                                        slideOutHorizontally(animationSpec = tween(200, easing = FastOutSlowInEasing)) { width -> width / 4 }
                                            )
                                    }
                                },
                                label = "AgendaStepTransition",
                                modifier = Modifier.fillMaxSize()
                            ) { step ->
                                val time = currentTime ?: selectedTimeForBarber ?: selectedTime ?: "09:00"
                                val barber = currentBarber ?: selectedBarber ?: "Barbeiro"
                                val services = currentServices ?: selectedServicesForSummary ?: emptyList()

                                when (step) {
                                    4 -> {
                                        BookingSummaryScreen(
                                            selectedDate = selectedDate,
                                            selectedTime = time,
                                            selectedBarber = barber,
                                            selectedServices = services,
                                            currentUser = currentUser,
                                            onBackClicked = {
                                                selectedServicesForSummary = null
                                            },
                                            onOpenAuth = {
                                                pendingBookingAction = true
                                                showAuthDialog = true
                                            },
                                            onConfirmFinalBooking = {
                                                val priceTotal = services.sumOf { it.price }
                                                val newBooking = ConfirmedBooking(
                                                    id = java.util.UUID.randomUUID().toString(),
                                                    date = selectedDate,
                                                    time = time,
                                                    barber = barber,
                                                    services = services,
                                                    totalPrice = priceTotal,
                                                    clientCode = currentUser?.clientCode,
                                                    clientName = currentUser?.fullName
                                                )
                                                confirmedBookings = listOf(newBooking) + confirmedBookings
                                                activeDestination = DrawerDestination.MY_BOOKINGS
                                                selectedServicesForSummary = null
                                                selectedBarber = null
                                                selectedTimeForBarber = null
                                                selectedTime = null
                                                Toast.makeText(context, "Agendamento concluído com sucesso para ${currentUser?.fullName ?: ""} (Código: ${currentUser?.clientCode})!", Toast.LENGTH_LONG).show()
                                            },
                                            modifier = Modifier.fillMaxSize()
                                        )
                                    }
                                    3 -> {
                                        ServiceSelectionScreen(
                                            selectedDate = selectedDate,
                                            selectedTime = time,
                                            selectedBarber = barber,
                                            onBackClicked = {
                                                selectedBarber = null
                                            },
                                            onContinueBooking = { selectedServices ->
                                                selectedServicesForSummary = selectedServices
                                            },
                                            modifier = Modifier.fillMaxSize()
                                        )
                                    }
                                    2 -> {
                                        BarberSelectionScreen(
                                            selectedDate = selectedDate,
                                            selectedTime = time,
                                            onBackClicked = {
                                                selectedTimeForBarber = null
                                                selectedTime = null
                                            },
                                            onBarberSelected = { barberName ->
                                                selectedBarber = barberName
                                            },
                                            modifier = Modifier.fillMaxSize()
                                        )
                                    }
                                    else -> {
                                        // SCROLLABLE CONTENT BELOW
                                        Column(
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .verticalScroll(scrollState)
                                                .padding(horizontal = 20.dp)
                                        ) {
                                            Spacer(modifier = Modifier.height(20.dp))

                                            // DATE SELECTION SECTION (WITH SMALLER DATE BUTTONS)
                                            DateSelectionSection(
                                                dates = dates,
                                                selectedDate = selectedDate,
                                                onDateSelected = { selectedDate = it }
                                            )

                                            Spacer(modifier = Modifier.height(24.dp))

                                            // TIME SELECTION BY SHIFTS SECTION
                                            TimeShiftsSection(
                                                shifts = shifts,
                                                selectedTime = selectedTime,
                                                onTimeSelected = { time ->
                                                    selectedTime = time
                                                    selectedTimeForBarber = time
                                                }
                                            )

                                            Spacer(modifier = Modifier.height(32.dp))
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                // SIDE MENU DRAWER - SLIDES FROM LEFT TO RIGHT, STRICTLY BELOW THE HEADER
                androidx.compose.animation.AnimatedVisibility(
                    visible = isMenuOpen,
                    enter = slideInHorizontally(
                        initialOffsetX = { -it },
                        animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing)
                    ) + fadeIn(animationSpec = tween(300)),
                    exit = slideOutHorizontally(
                        targetOffsetX = { -it },
                        animationSpec = tween(durationMillis = 250, easing = FastOutSlowInEasing)
                    ) + fadeOut(animationSpec = tween(250)),
                    modifier = Modifier.fillMaxSize()
                ) {
                    SideMenuDrawer(
                        currentUser = currentUser,
                        onClose = { isMenuOpen = false },
                        onNavigate = { destination ->
                            activeDestination = destination
                            if (destination == DrawerDestination.AGENDA) {
                                selectedServicesForSummary = null
                                selectedBarber = null
                                selectedTimeForBarber = null
                                selectedTime = null
                            }
                            isMenuOpen = false
                        },
                        onOpenAuth = {
                            isMenuOpen = false
                            showAuthDialog = true
                        },
                        onLogout = {
                            currentUser = null
                            Toast.makeText(context, "Sessão encerrada.", Toast.LENGTH_SHORT).show()
                        },
                        context = context
                    )
                }
            }

            if (showAuthDialog) {
                AuthDialog(
                    onDismiss = {
                        showAuthDialog = false
                        pendingBookingAction = false
                        pendingDestinationAfterAuth = null
                    },
                    registeredUsers = registeredUsers,
                    onRegisterUser = { newUser ->
                        registeredUsers = registeredUsers + newUser
                    },
                    onLoginSuccess = { user ->
                        currentUser = user
                        showAuthDialog = false
                        Toast.makeText(context, "Conectado como ${user.fullName} (Código: ${user.clientCode})", Toast.LENGTH_SHORT).show()
                        if (pendingDestinationAfterAuth != null) {
                            activeDestination = pendingDestinationAfterAuth!!
                            pendingDestinationAfterAuth = null
                        }
                        if (pendingBookingAction) {
                            pendingBookingAction = false
                            val time = selectedTimeForBarber ?: selectedTime ?: "09:00"
                            val barber = selectedBarber ?: "Barbeiro"
                            val services = selectedServicesForSummary ?: emptyList()
                            if (services.isNotEmpty()) {
                                val priceTotal = services.sumOf { it.price }
                                val newBooking = ConfirmedBooking(
                                    id = java.util.UUID.randomUUID().toString(),
                                    date = selectedDate,
                                    time = time,
                                    barber = barber,
                                    services = services,
                                    totalPrice = priceTotal,
                                    clientCode = user.clientCode,
                                    clientName = user.fullName
                                )
                                confirmedBookings = listOf(newBooking) + confirmedBookings
                                activeDestination = DrawerDestination.MY_BOOKINGS
                                selectedServicesForSummary = null
                                selectedBarber = null
                                selectedTimeForBarber = null
                                selectedTime = null
                                Toast.makeText(context, "Pré-agendamento concluído com sucesso! Código do Cliente: ${user.clientCode}", Toast.LENGTH_LONG).show()
                            }
                        }
                    },
                    onOpenAdminPanel = {
                        showAuthDialog = false
                        activeDestination = DrawerDestination.ADMIN_PANEL
                    }
                )
            }

            // BOTTOM QUICK ACCESS SIDEBAR / NAVIGATION BAR
            if (activeDestination != DrawerDestination.ADMIN_PANEL) {
                BottomQuickAccessBar(
                    activeDestination = activeDestination,
                    onNavigate = { destination ->
                        if (destination == DrawerDestination.MY_BOOKINGS && currentUser == null) {
                            pendingDestinationAfterAuth = DrawerDestination.MY_BOOKINGS
                            showAuthDialog = true
                        } else {
                            activeDestination = destination
                            if (destination == DrawerDestination.AGENDA) {
                                selectedServicesForSummary = null
                                selectedBarber = null
                                selectedTimeForBarber = null
                                selectedTime = null
                            }
                            isMenuOpen = false
                        }
                    }
                )
            }
        }
    }
}

@Composable
private fun HeaderSection(
    isMenuOpen: Boolean,
    currentUser: UserAccount?,
    onMenuToggle: () -> Unit,
    onOpenAuth: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .testTag("header_section"),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            // Golden gradient icon badge with scissors
            Box(
                modifier = Modifier
                    .size(42.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(YellowGradient),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.ContentCut,
                    contentDescription = "Ícone de Tesoura",
                    tint = TextBlack,
                    modifier = Modifier.size(20.dp)
                )
            }

            Column {
                Text(
                    text = "BARBEARIA",
                    color = YellowGold,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 2.2.sp
                )
                Text(
                    text = "JADSON BARBER",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.ExtraBold,
                        letterSpacing = 0.8.sp,
                        brush = YellowGradient
                    )
                )
                Text(
                    text = "Elegância, Tradição & Estilo Masculino",
                    color = TextGray,
                    fontSize = 9.sp,
                    fontWeight = FontWeight.Medium,
                    letterSpacing = 0.5.sp
                )
            }
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            // Top right notification icon badge (Sino)
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(CharcoalSurface)
                    .border(1.dp, CharcoalBorder, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Outlined.Notifications,
                    contentDescription = "Notificações",
                    tint = TextGray,
                    modifier = Modifier.size(18.dp)
                )
            }

            if (currentUser != null) {
                // Menu Button in Header - Shown when logged in
                Box(
                    modifier = Modifier
                        .size(42.dp)
                        .clip(CircleShape)
                        .background(CharcoalSurface)
                        .border(1.dp, if (isMenuOpen) YellowGold else CharcoalBorder, CircleShape)
                        .clickable { onMenuToggle() }
                        .testTag("header_menu_button"),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = if (isMenuOpen) Icons.Default.Close else Icons.Default.Menu,
                        contentDescription = "Botão de Menu",
                        tint = YellowGold,
                        modifier = Modifier.size(22.dp)
                    )
                }
            } else {
                // Login Button in Header - Shown when not logged in
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(16.dp))
                        .background(CharcoalSurface)
                        .border(1.dp, YellowGold.copy(alpha = 0.6f), RoundedCornerShape(16.dp))
                        .clickable { onOpenAuth() }
                        .padding(horizontal = 10.dp, vertical = 8.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.Login,
                            contentDescription = "Entrar",
                            tint = YellowGold,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "ENTRAR",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = YellowGold
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun SideMenuDrawer(
    currentUser: UserAccount?,
    onClose: () -> Unit,
    onNavigate: (DrawerDestination) -> Unit,
    onOpenAuth: () -> Unit,
    onLogout: () -> Unit,
    context: android.content.Context
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Backdrop dim layer - clicking closes the menu
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.65f))
                .clickable { onClose() }
        )

        // Sliding Drawer Container (occupies 80% width, aligned to Start/Left)
        Surface(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .fillMaxHeight()
                .fillMaxWidth(0.80f)
                .pointerInput(Unit) {
                    detectTapGestures { } // Consume taps inside drawer
                },
            color = Color.Black,
            tonalElevation = 12.dp,
            shadowElevation = 16.dp,
            border = androidx.compose.foundation.BorderStroke(1.dp, YellowGold.copy(alpha = 0.35f))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 24.dp, horizontal = 20.dp)
            ) {
                // Drawer Header
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(YellowGradient),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.ContentCut,
                                contentDescription = null,
                                tint = TextBlack,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                        Text(
                            text = "NAVEGAÇÃO",
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = YellowGold,
                                letterSpacing = 1.5.sp
                            )
                        )
                    }

                    Box(
                        modifier = Modifier
                            .size(32.dp)
                            .clip(CircleShape)
                            .background(YellowGold.copy(alpha = 0.2f))
                            .border(1.dp, YellowGold, CircleShape)
                            .clickable { onClose() },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Fechar Menu",
                            tint = YellowGold,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(18.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(
                            Brush.horizontalGradient(
                                colors = listOf(YellowGold.copy(alpha = 0.8f), Color.Transparent)
                            )
                        )
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Profile Section Card in Side Menu
                if (currentUser != null) {
                    Surface(
                        color = CharcoalSurface,
                        shape = RoundedCornerShape(16.dp),
                        border = androidx.compose.foundation.BorderStroke(1.dp, YellowGold.copy(alpha = 0.5f)),
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                onNavigate(DrawerDestination.PROFILE)
                            }
                    ) {
                        Column(
                            modifier = Modifier.padding(14.dp)
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .size(40.dp)
                                            .clip(CircleShape)
                                            .background(YellowGold.copy(alpha = 0.2f))
                                            .border(1.dp, YellowGold, CircleShape),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.AccountCircle,
                                            contentDescription = null,
                                            tint = YellowGold,
                                            modifier = Modifier.size(24.dp)
                                        )
                                    }

                                    Column {
                                        Text(
                                            text = currentUser.fullName,
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = TextWhite
                                        )
                                        Text(
                                            text = "Código: ${currentUser.clientCode}",
                                            fontSize = 12.sp,
                                            fontWeight = FontWeight.ExtraBold,
                                            color = YellowGold
                                        )
                                    }
                                }

                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                                    contentDescription = "Ver Perfil",
                                    tint = YellowGold,
                                    modifier = Modifier.size(18.dp)
                                )
                            }

                            Spacer(modifier = Modifier.height(12.dp))

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(YellowGradient)
                                        .clickable { onNavigate(DrawerDestination.PROFILE) }
                                        .padding(horizontal = 12.dp, vertical = 6.dp)
                                ) {
                                    Text(
                                        text = "MEU PERFIL",
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.ExtraBold,
                                        color = TextBlack
                                    )
                                }

                                Row(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(Color(0x22FF5555))
                                        .border(1.dp, Color(0xFFFF5555).copy(alpha = 0.5f), RoundedCornerShape(8.dp))
                                        .clickable { onLogout() }
                                        .padding(horizontal = 10.dp, vertical = 6.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Logout,
                                        contentDescription = null,
                                        tint = Color(0xFFFF7777),
                                        modifier = Modifier.size(12.dp)
                                    )
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text(
                                        text = "SAIR",
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color(0xFFFF7777)
                                    )
                                }
                            }
                        }
                    }
                } else {
                    Surface(
                        color = CharcoalSurface,
                        shape = RoundedCornerShape(16.dp),
                        border = androidx.compose.foundation.BorderStroke(1.dp, YellowGold.copy(alpha = 0.4f)),
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { onOpenAuth() }
                    ) {
                        Row(
                            modifier = Modifier.padding(14.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(10.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(38.dp)
                                        .clip(CircleShape)
                                        .background(YellowGold.copy(alpha = 0.15f))
                                        .border(1.dp, YellowGold.copy(alpha = 0.6f), CircleShape),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Login,
                                        contentDescription = null,
                                        tint = YellowGold,
                                        modifier = Modifier.size(20.dp)
                                    )
                                }

                                Column {
                                    Text(
                                        text = "Entrar / Cadastrar",
                                        fontSize = 13.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = TextWhite
                                    )
                                    Text(
                                        text = "Acesse sua conta do cliente",
                                        fontSize = 11.sp,
                                        color = TextGray
                                    )
                                }
                            }

                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                                contentDescription = null,
                                tint = YellowGold,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Scrollable List of Menu Options
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    DrawerMenuItem(
                        icon = Icons.Default.Home,
                        title = "Início / Agenda",
                        subtitle = "Ver horários e agendar",
                        onClick = {
                            onNavigate(DrawerDestination.AGENDA)
                        }
                    )

                    DrawerMenuItem(
                        icon = Icons.Default.AccountCircle,
                        title = "Meu Perfil",
                        subtitle = if (currentUser != null) "Código: ${currentUser.clientCode} • ${currentUser.fullName}" else "Acessar minha conta",
                        onClick = {
                            if (currentUser != null) {
                                onNavigate(DrawerDestination.PROFILE)
                            } else {
                                onOpenAuth()
                            }
                        }
                    )

                    DrawerMenuItem(
                        icon = Icons.Default.PhotoLibrary,
                        title = "Feed de Estilos",
                        subtitle = "Fotos, cortes e tendências",
                        onClick = {
                            onNavigate(DrawerDestination.FEED)
                        }
                    )

                    DrawerMenuItem(
                        icon = Icons.Default.ContentCut,
                        title = "Nossos Serviços",
                        subtitle = "Cortes, barba e selagem",
                        onClick = {
                            onNavigate(DrawerDestination.SERVICES)
                        }
                    )

                    DrawerMenuItem(
                        icon = Icons.Default.Person,
                        title = "Equipe de Barbeiros",
                        subtitle = "Profissionais qualificados",
                        onClick = {
                            onNavigate(DrawerDestination.BARBERS)
                        }
                    )

                    DrawerMenuItem(
                        icon = Icons.Default.EventAvailable,
                        title = "Meus Agendamentos",
                        subtitle = "Consulte horários marcados",
                        onClick = {
                            onNavigate(DrawerDestination.MY_BOOKINGS)
                        }
                    )

                    DrawerMenuItem(
                        icon = Icons.Default.LocationOn,
                        title = "Localização & Contato",
                        subtitle = "Endereço e horários",
                        onClick = {
                            onNavigate(DrawerDestination.LOCATION)
                        }
                    )

                    DrawerMenuItem(
                        icon = Icons.Default.Phone,
                        title = "WhatsApp Direct",
                        subtitle = "(11) 99999-8888",
                        onClick = {
                            Toast.makeText(context, "Abrindo conversa no WhatsApp...", Toast.LENGTH_SHORT).show()
                            onClose()
                        }
                    )

                    DrawerMenuItem(
                        icon = Icons.Default.Settings,
                        title = "Configurações",
                        subtitle = "Preferências e tema",
                        onClick = {
                            Toast.makeText(context, "Tema escuro ativo por padrão", Toast.LENGTH_SHORT).show()
                            onClose()
                        }
                    )

                    DrawerMenuItem(
                        icon = Icons.Default.AdminPanelSettings,
                        title = "Painel Administrativo",
                        subtitle = "Gestão, financeiro e horários",
                        onClick = {
                            onNavigate(DrawerDestination.ADMIN_PANEL)
                        }
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Footer Info Badge
                Surface(
                    color = Color.Black,
                    shape = RoundedCornerShape(12.dp),
                    border = androidx.compose.foundation.BorderStroke(1.dp, YellowGold.copy(alpha = 0.35f)),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier.padding(12.dp)
                    ) {
                        Text(
                            text = "Horário de Funcionamento",
                            color = YellowGold,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "Segunda a Sábado: 08:00 às 20:00",
                            color = TextGray,
                            fontSize = 11.sp
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun DrawerMenuItem(
    icon: ImageVector,
    title: String,
    subtitle: String,
    onClick: () -> Unit
) {
    Surface(
        onClick = onClick,
        color = Color(0xFF101010),
        shape = RoundedCornerShape(12.dp),
        border = androidx.compose.foundation.BorderStroke(1.dp, YellowGold.copy(alpha = 0.3f)),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(YellowGradient),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = title,
                    tint = TextBlack,
                    modifier = Modifier.size(18.dp)
                )
            }

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = title,
                    color = TextWhite,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = subtitle,
                    color = YellowGold.copy(alpha = 0.8f),
                    fontSize = 10.sp
                )
            }
        }
    }
}

@Composable
private fun AnimatedGradientHeaderBorder() {
    val infiniteTransition = rememberInfiniteTransition(label = "headerBreathingTransition")
    
    val alphaPulse by infiniteTransition.animateFloat(
        initialValue = 0.78f,
        targetValue = 1.0f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 2000, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "headerBorderAlpha"
    )

    val scalePulse by infiniteTransition.animateFloat(
        initialValue = 0.97f,
        targetValue = 1.0f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 2000, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "headerBorderScale"
    )

    val breathingBrush = Brush.horizontalGradient(
        colors = listOf(
            YellowGold.copy(alpha = 0.75f),
            YellowAmber,
            YellowBright,
            YellowGold,
            YellowAmber,
            YellowGold.copy(alpha = 0.75f)
        )
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp)
            .padding(bottom = 4.dp)
            .height(3.dp)
            .graphicsLayer {
                scaleX = scalePulse
                alpha = alphaPulse
            }
            .clip(CircleShape)
            .background(brush = breathingBrush)
    )
}

@Composable
private fun DateSelectionSection(
    dates: List<BarberDateOption>,
    selectedDate: BarberDateOption,
    onDateSelected: (BarberDateOption) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        // Section Header Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Default.CalendarToday,
                    contentDescription = "Calendário",
                    tint = YellowGold,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = "SELECIONE A DATA",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 1.sp,
                        color = TextGray
                    )
                )
            }

            Text(
                text = "Agosto 2026",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = YellowGold
            )
        }

        // Horizontal List of Date Cards (Smaller buttons as requested)
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(vertical = 2.dp)
        ) {
            items(dates, key = { it.id }) { date ->
                DateCard(
                    date = date,
                    isSelected = date.id == selectedDate.id,
                    onClick = { onDateSelected(date) }
                )
            }
        }
    }
}

@Composable
private fun DateCard(
    date: BarberDateOption,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    val textColor by animateColorAsState(
        targetValue = if (isSelected) TextBlack else TextWhite,
        label = "dateTextColor"
    )

    val subTextColor by animateColorAsState(
        targetValue = if (isSelected) TextBlack else TextGray,
        label = "dateSubTextColor"
    )

    Box(
        modifier = Modifier
            .width(66.dp)
            .clip(RoundedCornerShape(14.dp))
            .background(
                if (isSelected) YellowGradient else Brush.linearGradient(
                    listOf(CharcoalCard, CharcoalCardLight)
                )
            )
            .border(
                width = if (isSelected) 1.5.dp else 1.dp,
                color = if (isSelected) YellowGold else CharcoalBorder,
                shape = RoundedCornerShape(14.dp)
            )
            .clickable(onClick = onClick)
            .padding(vertical = 8.dp, horizontal = 4.dp)
            .testTag("date_card_${date.id}"),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Optional Badge ("Hoje", "Amanhã")
            if (date.badgeLabel != null) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(6.dp))
                        .background(
                            if (isSelected) TextBlack.copy(alpha = 0.15f) else YellowAmber.copy(
                                alpha = 0.2f
                            )
                        )
                        .padding(horizontal = 4.dp, vertical = 1.dp)
                ) {
                    Text(
                        text = date.badgeLabel,
                        fontSize = 9.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (isSelected) TextBlack else YellowGold
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))
            }

            // Day of Week
            Text(
                text = date.dayOfWeek,
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold,
                color = subTextColor
            )

            Spacer(modifier = Modifier.height(1.dp))

            // Day Number (Smaller size)
            Text(
                text = date.dayNumber,
                fontSize = 18.sp,
                fontWeight = FontWeight.ExtraBold,
                color = textColor
            )

            // Month
            Text(
                text = date.month,
                fontSize = 10.sp,
                fontWeight = FontWeight.Medium,
                color = subTextColor
            )
        }
    }
}

@Composable
private fun TimeShiftsSection(
    shifts: List<BarberTimeShift>,
    selectedTime: String?,
    onTimeSelected: (String) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        // Section Header Row
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 12.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Schedule,
                contentDescription = "Horário",
                tint = YellowGold,
                modifier = Modifier.size(16.dp)
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = "SELECIONE O HORÁRIO",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 1.sp,
                    color = TextGray
                )
            )
        }

        // List of Shifts
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            shifts.forEach { shift ->
                ShiftBlock(
                    shift = shift,
                    selectedTime = selectedTime,
                    onTimeSelected = onTimeSelected
                )
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun ShiftBlock(
    shift: BarberTimeShift,
    selectedTime: String?,
    onTimeSelected: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(CharcoalSurface)
            .border(1.dp, CharcoalBorder, RoundedCornerShape(16.dp))
            .padding(14.dp)
    ) {
        // Shift Header with Icon
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 10.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(32.dp)
                    .clip(CircleShape)
                    .background(YellowAmber.copy(alpha = 0.15f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = shift.icon,
                    contentDescription = shift.title,
                    tint = YellowGold,
                    modifier = Modifier.size(18.dp)
                )
            }

            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Text(
                    text = "Turno da ${shift.title}",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = TextWhite
                )
                Text(
                    text = shift.subtitle,
                    fontSize = 11.sp,
                    color = TextGray
                )
            }
        }

        // Time slots grid using FlowRow
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            shift.slots.forEach { time ->
                val isSelected = time == selectedTime
                TimeSlotChip(
                    time = time,
                    isSelected = isSelected,
                    onClick = { onTimeSelected(time) }
                )
            }
        }
    }
}

@Composable
private fun TimeSlotChip(
    time: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .background(
                if (isSelected) YellowGradient else Brush.linearGradient(
                    listOf(CharcoalCard, CharcoalCardLight)
                )
            )
            .border(
                width = if (isSelected) 1.5.dp else 1.dp,
                color = if (isSelected) YellowGold else CharcoalBorder,
                shape = RoundedCornerShape(12.dp)
            )
            .clickable(onClick = onClick)
            .padding(horizontal = 14.dp, vertical = 9.dp)
            .testTag("time_chip_$time"),
        contentAlignment = Alignment.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            if (isSelected) {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = "Selecionado",
                    tint = TextBlack,
                    modifier = Modifier.size(15.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
            }

            Text(
                text = time,
                fontSize = 13.sp,
                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                color = if (isSelected) TextBlack else TextWhite
            )
        }
    }
}

data class BarberOption(
    val id: String,
    val name: String,
    val role: String,
    val rating: String,
    val isAnyBarber: Boolean = false
)

@Composable
fun BarberSelectionScreen(
    selectedDate: BarberDateOption,
    selectedTime: String,
    onBackClicked: () -> Unit,
    onBarberSelected: (barberName: String) -> Unit,
    modifier: Modifier = Modifier
) {
    val barbers = remember {
        listOf(
            BarberOption(
                id = "0",
                name = "Qualquer Barbeiro Disponível",
                role = "Primeiro disponível • Atendimento mais rápido",
                rating = "5.0",
                isAnyBarber = true
            ),
            BarberOption(
                id = "1",
                name = "Jadson Barber",
                role = "Mestre Barbeiro & Proprietário",
                rating = "5.0"
            ),
            BarberOption(
                id = "2",
                name = "Lucas Silva",
                role = "Especialista em Degradê & Navalhado",
                rating = "4.9"
            ),
            BarberOption(
                id = "3",
                name = "Mateus Costa",
                role = "Especialista em Barba & Corte Clássico",
                rating = "4.8"
            )
        )
    }

    val scrollState = rememberScrollState()

    Column(
        modifier = modifier.fillMaxSize()
    ) {
        // TOP SUB-HEADER WITH BACK BUTTON
        Surface(
            color = CharcoalBg,
            tonalElevation = 2.dp,
            border = androidx.compose.foundation.BorderStroke(1.dp, CharcoalBorder),
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = onBackClicked,
                    modifier = Modifier.testTag("back_button")
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Voltar",
                        tint = YellowGold
                    )
                }

                Spacer(modifier = Modifier.width(4.dp))

                Column {
                    Text(
                        text = "Escolha o Barbeiro",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = TextWhite
                    )
                    Text(
                        text = "Profissionais disponíveis para o horário",
                        fontSize = 11.sp,
                        color = TextGray
                    )
                }
            }
        }

        // MAIN SCROLLABLE CONTENT
        Column(
            modifier = Modifier
                .weight(1f)
                .verticalScroll(scrollState)
                .padding(horizontal = 20.dp)
        ) {
                Spacer(modifier = Modifier.height(16.dp))

                // SELECTED SLOT SUMMARY CARD
                Surface(
                    color = CharcoalSurface,
                    shape = RoundedCornerShape(16.dp),
                    border = androidx.compose.foundation.BorderStroke(1.dp, YellowGold.copy(alpha = 0.5f)),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .size(36.dp)
                                    .clip(CircleShape)
                                    .background(YellowGold.copy(alpha = 0.15f)),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = Icons.Default.CalendarToday,
                                    contentDescription = "Data",
                                    tint = YellowGold,
                                    modifier = Modifier.size(18.dp)
                                )
                            }
                            Spacer(modifier = Modifier.width(10.dp))
                            Column {
                                Text(
                                    text = "DATA",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = TextGray
                                )
                                Text(
                                    text = selectedDate.fullFormatted,
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = TextWhite
                                )
                            }
                        }

                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .size(36.dp)
                                    .clip(CircleShape)
                                    .background(YellowGold.copy(alpha = 0.15f)),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Schedule,
                                    contentDescription = "Horário",
                                    tint = YellowGold,
                                    modifier = Modifier.size(18.dp)
                                )
                            }
                            Spacer(modifier = Modifier.width(10.dp))
                            Column {
                                Text(
                                    text = "HORÁRIO",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = TextGray
                                )
                                Text(
                                    text = selectedTime,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.ExtraBold,
                                    color = YellowGold
                                )
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "SELECIONE O PROFISSIONAL",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = TextGray,
                    letterSpacing = 1.sp
                )

                Spacer(modifier = Modifier.height(12.dp))

                // LIST OF BARBERS
                barbers.forEach { barber ->
                    BarberCardItem(
                        barber = barber,
                        selectedTime = selectedTime,
                        onClick = { onBarberSelected(barber.name) }
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                }

                Spacer(modifier = Modifier.height(24.dp))
            }
        }
}

@Composable
private fun BarberCardItem(
    barber: BarberOption,
    selectedTime: String,
    onClick: () -> Unit
) {
    Surface(
        color = CharcoalSurface,
        shape = RoundedCornerShape(16.dp),
        border = androidx.compose.foundation.BorderStroke(
            1.dp,
            if (barber.isAnyBarber) YellowGold else CharcoalBorder
        ),
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .clickable(onClick = onClick)
            .testTag("barber_card_${barber.id}")
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // AVATAR
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .background(
                            if (barber.isAnyBarber) YellowGradient else Brush.linearGradient(
                                listOf(CharcoalCard, CharcoalCardLight)
                            )
                        )
                        .border(
                            1.dp,
                            if (barber.isAnyBarber) YellowGold else CharcoalBorder,
                            CircleShape
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = if (barber.isAnyBarber) Icons.Default.ContentCut else Icons.Default.Person,
                        contentDescription = barber.name,
                        tint = if (barber.isAnyBarber) TextBlack else YellowGold,
                        modifier = Modifier.size(24.dp)
                    )
                }

                Spacer(modifier = Modifier.width(14.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = barber.name,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = TextWhite
                        )

                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "Avaliação",
                                tint = YellowGold,
                                modifier = Modifier.size(14.dp)
                            )
                            Spacer(modifier = Modifier.width(2.dp))
                            Text(
                                text = barber.rating,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = YellowGold
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = barber.role,
                        fontSize = 12.sp,
                        color = TextGray
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // BOTTOM ACTION BAR IN CARD
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Surface(
                    color = YellowGold.copy(alpha = 0.12f),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = "Disponível às $selectedTime",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = YellowGold,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                    )
                }

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(YellowGradient)
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                ) {
                    Text(
                        text = "SELECIONAR",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = TextBlack
                    )
                }
            }
        }
    }
}

data class BarberService(
    val id: String,
    val title: String,
    val description: String,
    val price: Double,
    val durationMinutes: Int,
    val isPopular: Boolean = false
)

@Composable
fun ServiceSelectionScreen(
    selectedDate: BarberDateOption,
    selectedTime: String,
    selectedBarber: String,
    onBackClicked: () -> Unit,
    onContinueBooking: (selectedServices: List<BarberService>) -> Unit,
    modifier: Modifier = Modifier
) {
    val services = remember {
        listOf(
            BarberService("1", "Corte de Cabelo", "Degradê, social, militar ou tesoura com lavagem", 45.0, 30, isPopular = true),
            BarberService("2", "Barba Completa", "Toalha quente, alinhamento com navalha e pós-barba", 35.0, 20, isPopular = true),
            BarberService("3", "Pezinho / Acabamento", "Alinhamento do contorno do cabelo e nuca", 20.0, 15),
            BarberService("4", "Sobrancelha", "Design e limpeza com navalha ou tesoura", 15.0, 10),
            BarberService("5", "Hidratação Capilar", "Tratamento profundo com produtos premium", 35.0, 20),
            BarberService("6", "Pigmentação", "Disfarce de falhas no cabelo ou barba com realce de cor", 40.0, 25),
            BarberService("7", "Combo Corte + Barba", "Atendimento completo cabelo + barba com desconto", 70.0, 50, isPopular = true)
        )
    }

    var selectedServiceIds by remember { mutableStateOf(setOf("1")) }

    val selectedServices = remember(selectedServiceIds) {
        services.filter { it.id in selectedServiceIds }
    }

    val totalPrice = remember(selectedServices) {
        selectedServices.sumOf { it.price }
    }

    val totalDuration = remember(selectedServices) {
        selectedServices.sumOf { it.durationMinutes }
    }

    val scrollState = rememberScrollState()

    Column(
        modifier = modifier.fillMaxSize()
    ) {
        // TOP SUB-HEADER WITH BACK BUTTON
        Surface(
            color = CharcoalBg,
            tonalElevation = 2.dp,
            border = androidx.compose.foundation.BorderStroke(1.dp, CharcoalBorder),
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = onBackClicked,
                    modifier = Modifier.testTag("back_button_services")
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Voltar",
                        tint = YellowGold
                    )
                }

                Spacer(modifier = Modifier.width(4.dp))

                Column {
                    Text(
                        text = "Escolha os Serviços",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = TextWhite
                    )
                    Text(
                        text = "Selecione um ou mais serviços desejados",
                        fontSize = 11.sp,
                        color = TextGray
                    )
                }
            }
        }

        // MAIN CONTENT
        Column(
            modifier = Modifier
                .weight(1f)
                .verticalScroll(scrollState)
                .padding(horizontal = 20.dp)
        ) {
            Spacer(modifier = Modifier.height(16.dp))

            // SUMMARY CARD (DATE, TIME, BARBER)
            Surface(
                color = CharcoalSurface,
                shape = RoundedCornerShape(16.dp),
                border = androidx.compose.foundation.BorderStroke(1.dp, YellowGold.copy(alpha = 0.5f)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(14.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.CalendarToday,
                                contentDescription = null,
                                tint = YellowGold,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = "${selectedDate.fullFormatted} às $selectedTime",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = TextWhite
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = null,
                            tint = YellowGold,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "Barbeiro: ",
                            fontSize = 12.sp,
                            color = TextGray
                        )
                        Text(
                            text = selectedBarber,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = YellowGold
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "SERVIÇOS DISPONÍVEIS",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = TextGray,
                letterSpacing = 1.sp
            )

            Spacer(modifier = Modifier.height(12.dp))

            services.forEach { service ->
                val isSelected = service.id in selectedServiceIds
                ServiceCardItem(
                    service = service,
                    isSelected = isSelected,
                    onToggle = {
                        selectedServiceIds = if (isSelected) {
                            selectedServiceIds - service.id
                        } else {
                            selectedServiceIds + service.id
                        }
                    }
                )
                Spacer(modifier = Modifier.height(10.dp))
            }

            Spacer(modifier = Modifier.height(10.dp))

            // SOMA DOS VALORES CARD
            Surface(
                color = CharcoalSurface,
                shape = RoundedCornerShape(14.dp),
                border = androidx.compose.foundation.BorderStroke(1.dp, YellowGold.copy(alpha = 0.4f)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(14.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = "SOMA DOS VALORES",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = TextGray
                        )
                        Text(
                            text = if (selectedServices.isEmpty()) "Nenhum serviço selecionado"
                                   else "${selectedServices.size} ${if (selectedServices.size == 1) "serviço" else "serviços"} (${totalDuration} min)",
                            fontSize = 12.sp,
                            color = TextWhite
                        )
                    }
                    Text(
                        text = "R$ ${String.format("%.2f", totalPrice).replace('.', ',')}",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = YellowGold
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // CONTINUAR BUTTON BELOW SERVICES AND TOTAL
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(
                        if (selectedServices.isNotEmpty()) YellowGradient
                        else Brush.linearGradient(listOf(CharcoalCard, CharcoalCard))
                    )
                    .border(
                        1.dp,
                        if (selectedServices.isNotEmpty()) YellowGold else CharcoalBorder,
                        RoundedCornerShape(12.dp)
                    )
                    .clickable(
                        enabled = selectedServices.isNotEmpty(),
                        onClick = { onContinueBooking(selectedServices) }
                    )
                    .padding(vertical = 14.dp)
                    .testTag("continue_to_summary_button"),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "CONTINUAR",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.ExtraBold,
                    letterSpacing = 1.sp,
                    color = if (selectedServices.isNotEmpty()) TextBlack else TextGray
                )
            }

            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Composable
private fun ServiceCardItem(
    service: BarberService,
    isSelected: Boolean,
    onToggle: () -> Unit
) {
    Surface(
        color = if (isSelected) CharcoalCardLight else CharcoalSurface,
        shape = RoundedCornerShape(14.dp),
        border = androidx.compose.foundation.BorderStroke(
            1.dp,
            if (isSelected) YellowGold else CharcoalBorder
        ),
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(14.dp))
            .clickable(onClick = onToggle)
            .testTag("service_card_${service.id}")
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // CHECKBOX BOX
            Box(
                modifier = Modifier
                    .size(24.dp)
                    .clip(RoundedCornerShape(6.dp))
                    .background(
                        if (isSelected) YellowGold else CharcoalCard
                    )
                    .border(
                        1.dp,
                        if (isSelected) YellowGold else CharcoalBorder,
                        RoundedCornerShape(6.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                if (isSelected) {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = "Selecionado",
                        tint = TextBlack,
                        modifier = Modifier.size(16.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.width(14.dp))

            Column(modifier = Modifier.weight(1f)) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.weight(1f, fill = false)
                    ) {
                        Text(
                            text = service.title,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = TextWhite
                        )
                        if (service.isPopular) {
                            Spacer(modifier = Modifier.width(8.dp))
                            Surface(
                                color = YellowGold.copy(alpha = 0.15f),
                                shape = RoundedCornerShape(6.dp)
                            ) {
                                Text(
                                    text = "POPULAR",
                                    fontSize = 9.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = YellowGold,
                                    modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    Text(
                        text = "R$ ${String.format("%.2f", service.price).replace('.', ',')}",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = if (isSelected) YellowGold else TextWhite
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = service.description,
                        fontSize = 11.sp,
                        color = TextGray,
                        modifier = Modifier.weight(1f, fill = false)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.Schedule,
                            contentDescription = null,
                            tint = TextGray,
                            modifier = Modifier.size(12.dp)
                        )
                        Spacer(modifier = Modifier.width(2.dp))
                        Text(
                            text = "${service.durationMinutes} min",
                            fontSize = 11.sp,
                            color = TextGray
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun BookingSummaryScreen(
    selectedDate: BarberDateOption,
    selectedTime: String,
    selectedBarber: String,
    selectedServices: List<BarberService>,
    currentUser: UserAccount?,
    onBackClicked: () -> Unit,
    onOpenAuth: () -> Unit,
    onConfirmFinalBooking: () -> Unit,
    modifier: Modifier = Modifier
) {
    val totalPrice = remember(selectedServices) {
        selectedServices.sumOf { it.price }
    }
    val totalDuration = remember(selectedServices) {
        selectedServices.sumOf { it.durationMinutes }
    }

    val scrollState = rememberScrollState()

    Column(
        modifier = modifier.fillMaxSize()
    ) {
        // TOP SUB-HEADER WITH BACK BUTTON
        Surface(
            color = CharcoalBg,
            tonalElevation = 2.dp,
            border = androidx.compose.foundation.BorderStroke(1.dp, CharcoalBorder),
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = onBackClicked,
                    modifier = Modifier.testTag("back_button_summary")
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Voltar",
                        tint = YellowGold
                    )
                }

                Spacer(modifier = Modifier.width(4.dp))

                Column {
                    Text(
                        text = "Resumo do Agendamento",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = TextWhite
                    )
                    Text(
                        text = "Confirme as informações antes de finalizar",
                        fontSize = 11.sp,
                        color = TextGray
                    )
                }
            }
        }

        // SCROLLABLE SUMMARY CONTENT
        Column(
            modifier = Modifier
                .weight(1f)
                .verticalScroll(scrollState)
                .padding(horizontal = 20.dp)
        ) {
            Spacer(modifier = Modifier.height(16.dp))

            // DATE, TIME & BARBER CARD
            Text(
                text = "DETALHES DO AGENDAMENTO",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = TextGray,
                letterSpacing = 1.sp
            )

            Spacer(modifier = Modifier.height(10.dp))

            Surface(
                color = CharcoalSurface,
                shape = RoundedCornerShape(16.dp),
                border = androidx.compose.foundation.BorderStroke(1.dp, YellowGold.copy(alpha = 0.5f)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .size(36.dp)
                                    .clip(CircleShape)
                                    .background(YellowGold.copy(alpha = 0.15f)),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = Icons.Default.CalendarToday,
                                    contentDescription = null,
                                    tint = YellowGold,
                                    modifier = Modifier.size(18.dp)
                                )
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Column {
                                Text(
                                    text = "DATA E HORÁRIO",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = TextGray
                                )
                                Text(
                                    text = "${selectedDate.fullFormatted} às $selectedTime",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = TextWhite
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .clip(CircleShape)
                                .background(YellowGold.copy(alpha = 0.15f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = null,
                                tint = YellowGold,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Column {
                            Text(
                                text = "BARBEIRO",
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                color = TextGray
                            )
                            Text(
                                text = selectedBarber,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = YellowGold
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            // SELECTED SERVICES CARD
            Text(
                text = "SERVIÇOS SELECIONADOS",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = TextGray,
                letterSpacing = 1.sp
            )

            Spacer(modifier = Modifier.height(10.dp))

            Surface(
                color = CharcoalSurface,
                shape = RoundedCornerShape(16.dp),
                border = androidx.compose.foundation.BorderStroke(1.dp, CharcoalBorder),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    selectedServices.forEachIndexed { index, service ->
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = service.title,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = TextWhite
                                )
                                Text(
                                    text = "${service.durationMinutes} minutos",
                                    fontSize = 11.sp,
                                    color = TextGray
                                )
                            }

                            Text(
                                text = "R$ ${String.format("%.2f", service.price).replace('.', ',')}",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = YellowGold
                            )
                        }

                        if (index < selectedServices.size - 1) {
                            Spacer(modifier = Modifier.height(10.dp))
                            Surface(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(1.dp),
                                color = CharcoalBorder
                            ) {}
                            Spacer(modifier = Modifier.height(10.dp))
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    Surface(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(1.dp),
                        color = YellowGold.copy(alpha = 0.3f)
                    ) {}

                    Spacer(modifier = Modifier.height(12.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "TOTAL (${totalDuration} min)",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = TextGray
                        )
                        Text(
                            text = "R$ ${String.format("%.2f", totalPrice).replace('.', ',')}",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = YellowGold
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            if (currentUser != null) {
                Text(
                    text = "DADOS DO CLIENTE CONECTADO",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = TextGray,
                    letterSpacing = 1.sp
                )

                Spacer(modifier = Modifier.height(10.dp))

                Surface(
                    color = CharcoalSurface,
                    shape = RoundedCornerShape(16.dp),
                    border = androidx.compose.foundation.BorderStroke(1.dp, YellowGold.copy(alpha = 0.5f)),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Text(
                                text = currentUser.fullName,
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                color = TextWhite
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = "WhatsApp: ${currentUser.phone}",
                                fontSize = 12.sp,
                                color = TextGray
                            )
                            if (!currentUser.email.isNullOrBlank()) {
                                Text(
                                    text = "Email: ${currentUser.email}",
                                    fontSize = 12.sp,
                                    color = TextGray
                                )
                            }
                        }

                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .background(YellowGold.copy(alpha = 0.2f))
                                .border(1.dp, YellowGold, RoundedCornerShape(10.dp))
                                .padding(horizontal = 10.dp, vertical = 6.dp)
                        ) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = "CÓDIGO",
                                    fontSize = 9.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = YellowGold
                                )
                                Text(
                                    text = currentUser.clientCode,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.ExtraBold,
                                    color = YellowGold
                                )
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(YellowGradient)
                        .border(1.dp, YellowGold, RoundedCornerShape(12.dp))
                        .clickable(
                            onClick = { onConfirmFinalBooking() }
                        )
                        .padding(vertical = 14.dp)
                        .testTag("confirm_final_booking_button"),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "CONCLUIR AGENDAMENTO (CÓDIGO: ${currentUser.clientCode})",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.ExtraBold,
                        letterSpacing = 0.5.sp,
                        color = TextBlack
                    )
                }
            } else {
                Surface(
                    color = CharcoalSurface,
                    shape = RoundedCornerShape(16.dp),
                    border = androidx.compose.foundation.BorderStroke(1.dp, YellowGold),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.Lock,
                                contentDescription = null,
                                tint = YellowGold,
                                modifier = Modifier.size(22.dp)
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Column {
                                Text(
                                    text = "PRÉ-AGENDAMENTO SELECIONADO",
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = YellowGold
                                )
                                Text(
                                    text = "Faça login ou cadastre-se para concluir",
                                    fontSize = 11.sp,
                                    color = TextGray
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text = "Seu pré-agendamento está pronto! Para concluir a reserva, faça login ou cadastre sua conta.",
                            fontSize = 12.sp,
                            color = TextWhite,
                            lineHeight = 16.sp
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "• Cadastro: Nome completo, Telefone/Whatsapp, Senha e Email (opcional)\n• Você receberá um Código do Cliente único de 3 dígitos e 1 letra (Ex: 482K)",
                            fontSize = 11.sp,
                            color = TextGray,
                            lineHeight = 15.sp
                        )
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(YellowGradient)
                        .border(1.dp, YellowGold, RoundedCornerShape(12.dp))
                        .clickable(
                            onClick = { onOpenAuth() }
                        )
                        .padding(vertical = 14.dp)
                        .testTag("confirm_final_booking_button"),
                    contentAlignment = Alignment.Center
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.Login,
                            contentDescription = null,
                            tint = TextBlack,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "ENTRAR OU CADASTRAR PARA CONCLUIR",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.ExtraBold,
                            letterSpacing = 0.5.sp,
                            color = TextBlack
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Composable
private fun ServicesListScreen(
    onSelectServiceToSchedule: () -> Unit
) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(horizontal = 20.dp)
    ) {
        Spacer(modifier = Modifier.height(16.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.ContentCut,
                contentDescription = null,
                tint = YellowGold,
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "NOSSOS SERVIÇOS E PREÇOS",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = YellowGold,
                letterSpacing = 1.sp
            )
        }

        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = "Confira a tabela completa de serviços da Jadson Barber",
            fontSize = 12.sp,
            color = TextGray
        )

        Spacer(modifier = Modifier.height(20.dp))

        val services = remember {
            listOf(
                BarberService("1", "Corte de Cabelo", "Degradê, social, militar ou tesoura com lavagem", 45.0, 30, isPopular = true),
                BarberService("2", "Barba Completa", "Toalha quente, alinhamento com navalha e pós-barba", 35.0, 20, isPopular = true),
                BarberService("3", "Pezinho / Acabamento", "Alinhamento do contorno do cabelo e nuca", 20.0, 15),
                BarberService("4", "Sobrancelha", "Design e limpeza com navalha ou tesoura", 15.0, 10),
                BarberService("5", "Hidratação Capilar", "Tratamento profundo com produtos premium", 35.0, 20),
                BarberService("6", "Pigmentação", "Disfarce de falhas no cabelo ou barba com realce de cor", 40.0, 25),
                BarberService("7", "Combo Corte + Barba", "Atendimento completo cabelo + barba com desconto", 70.0, 50, isPopular = true)
            )
        }

        services.forEach { service ->
            Surface(
                color = CharcoalSurface,
                shape = RoundedCornerShape(16.dp),
                border = androidx.compose.foundation.BorderStroke(1.dp, CharcoalBorder),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.Top
                    ) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = service.title,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = TextWhite
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = service.description,
                                fontSize = 12.sp,
                                color = TextGray
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "R$ ${String.format("%.2f", service.price).replace('.', ',')}",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = YellowGold
                        )
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.AccessTime,
                                contentDescription = null,
                                tint = TextGray,
                                modifier = Modifier.size(14.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "${service.durationMinutes} minutos",
                                fontSize = 11.sp,
                                color = TextGray
                            )
                        }

                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(8.dp))
                                .background(YellowGradient)
                                .clickable { onSelectServiceToSchedule() }
                                .padding(horizontal = 14.dp, vertical = 6.dp)
                        ) {
                            Text(
                                text = "AGENDAR SERVIÇO",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = TextBlack
                            )
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
        }

        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Composable
private fun BarbersListScreen(
    onSelectBarberToSchedule: (String) -> Unit
) {
    val barbers = remember {
        listOf(
            BarberOption(
                id = "0",
                name = "Qualquer Barbeiro Disponível",
                role = "Primeiro disponível • Atendimento mais rápido",
                rating = "5.0",
                isAnyBarber = true
            ),
            BarberOption(
                id = "1",
                name = "Jadson Barber",
                role = "Mestre Barbeiro & Proprietário",
                rating = "5.0"
            ),
            BarberOption(
                id = "2",
                name = "Lucas Silva",
                role = "Especialista em Degradê & Navalhado",
                rating = "4.9"
            ),
            BarberOption(
                id = "3",
                name = "Mateus Costa",
                role = "Especialista em Barba & Corte Clássico",
                rating = "4.8"
            )
        )
    }

    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(horizontal = 20.dp)
    ) {
        Spacer(modifier = Modifier.height(16.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = null,
                tint = YellowGold,
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "EQUIPE DE BARBEIROS",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = YellowGold,
                letterSpacing = 1.sp
            )
        }

        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = "Profissionais altamente qualificados para o seu estilo",
            fontSize = 12.sp,
            color = TextGray
        )

        Spacer(modifier = Modifier.height(20.dp))

        barbers.forEach { barber ->
            Surface(
                color = CharcoalSurface,
                shape = RoundedCornerShape(16.dp),
                border = androidx.compose.foundation.BorderStroke(
                    1.dp,
                    if (barber.isAnyBarber) YellowGold else CharcoalBorder
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(50.dp)
                                .clip(CircleShape)
                                .background(
                                    if (barber.isAnyBarber) YellowGradient else Brush.linearGradient(
                                        listOf(CharcoalCard, CharcoalCardLight)
                                    )
                                )
                                .border(
                                    1.dp,
                                    if (barber.isAnyBarber) YellowGold else CharcoalBorder,
                                    CircleShape
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = if (barber.isAnyBarber) Icons.Default.ContentCut else Icons.Default.Person,
                                contentDescription = null,
                                tint = if (barber.isAnyBarber) TextBlack else YellowGold,
                                modifier = Modifier.size(24.dp)
                            )
                        }

                        Spacer(modifier = Modifier.width(14.dp))

                        Column(modifier = Modifier.weight(1f)) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = barber.name,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = TextWhite
                                )

                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = null,
                                        tint = YellowGold,
                                        modifier = Modifier.size(14.dp)
                                    )
                                    Spacer(modifier = Modifier.width(2.dp))
                                    Text(
                                        text = barber.rating,
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = YellowGold
                                    )
                                }
                            }

                            Text(
                                text = barber.role,
                                fontSize = 12.sp,
                                color = TextGray
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(10.dp))
                            .background(YellowGradient)
                            .clickable { onSelectBarberToSchedule(barber.name) }
                            .padding(vertical = 10.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "AGENDAR COM ${barber.name.uppercase()}",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = TextBlack
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
        }

        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Composable
private fun MyBookingsScreen(
    bookings: List<ConfirmedBooking>,
    dates: List<BarberDateOption>,
    shifts: List<BarberTimeShift>,
    allServices: List<BarberService>,
    onNewBookingClick: () -> Unit,
    onUpdateBooking: (ConfirmedBooking) -> Unit,
    onCancelBooking: (String) -> Unit
) {
    val context = LocalContext.current
    val scrollState = rememberScrollState()

    var bookingToReschedule by remember { mutableStateOf<ConfirmedBooking?>(null) }
    var bookingToEditServices by remember { mutableStateOf<ConfirmedBooking?>(null) }

    var newSelectedDate by remember { mutableStateOf<BarberDateOption?>(null) }
    var newSelectedTime by remember { mutableStateOf<String?>(null) }
    var editedServiceIds by remember { mutableStateOf<Set<String>>(emptySet()) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(horizontal = 20.dp)
    ) {
        Spacer(modifier = Modifier.height(16.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.EventAvailable,
                contentDescription = null,
                tint = YellowGold,
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "MEUS AGENDAMENTOS",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = YellowGold,
                letterSpacing = 1.sp
            )
        }

        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = "Consulte, reagende ou edite os serviços dos seus horários",
            fontSize = 12.sp,
            color = TextGray
        )

        Spacer(modifier = Modifier.height(20.dp))

        if (bookings.isEmpty()) {
            Surface(
                color = CharcoalSurface,
                shape = RoundedCornerShape(16.dp),
                border = androidx.compose.foundation.BorderStroke(1.dp, CharcoalBorder),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(32.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = Icons.Default.CalendarToday,
                        contentDescription = null,
                        tint = TextGray,
                        modifier = Modifier.size(48.dp)
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = "Nenhum agendamento encontrado",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = TextWhite
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Escolha um dia e horário na agenda para marcar seu horário.",
                        fontSize = 12.sp,
                        color = TextGray,
                        textAlign = androidx.compose.ui.text.style.TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .background(YellowGradient)
                            .clickable { onNewBookingClick() }
                            .padding(horizontal = 20.dp, vertical = 12.dp)
                    ) {
                        Text(
                            text = "AGENDAR AGORA",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = TextBlack
                        )
                    }
                }
            }
        } else {
            bookings.forEach { booking ->
                Surface(
                    color = CharcoalSurface,
                    shape = RoundedCornerShape(16.dp),
                    border = androidx.compose.foundation.BorderStroke(1.dp, YellowGold.copy(alpha = 0.5f)),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Default.CheckCircle,
                                    contentDescription = null,
                                    tint = YellowGold,
                                    modifier = Modifier.size(18.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = booking.status,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = YellowGold
                                )
                            }

                            Text(
                                text = "R$ ${String.format("%.2f", booking.totalPrice).replace('.', ',')}",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.ExtraBold,
                                color = YellowGold
                            )
                        }

                        Spacer(modifier = Modifier.height(12.dp))

                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.CalendarToday,
                                contentDescription = null,
                                tint = TextWhite,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "${booking.date.fullFormatted} às ${booking.time}",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = TextWhite
                            )
                        }

                        Spacer(modifier = Modifier.height(6.dp))

                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = null,
                                tint = TextGray,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "Barbeiro: ${booking.barber}",
                                fontSize = 13.sp,
                                color = TextGray
                            )
                        }

                        Spacer(modifier = Modifier.height(12.dp))

                        Surface(
                            color = CharcoalCard,
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Column(modifier = Modifier.padding(12.dp)) {
                                Text(
                                    text = "Serviços contratados:",
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = TextGray
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                booking.services.forEach { s ->
                                    Text(
                                        text = "• ${s.title}",
                                        fontSize = 12.sp,
                                        color = TextWhite
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(14.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.End),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            // BOTÃO EDITAR SERVIÇOS
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(CharcoalBg)
                                    .border(1.dp, YellowGold.copy(alpha = 0.5f), RoundedCornerShape(8.dp))
                                    .clickable {
                                        bookingToEditServices = booking
                                        editedServiceIds = booking.services.map { it.id }.toSet()
                                    }
                                    .padding(horizontal = 8.dp, vertical = 6.dp)
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        imageVector = Icons.Default.ContentCut,
                                        contentDescription = null,
                                        tint = YellowGold,
                                        modifier = Modifier.size(12.dp)
                                    )
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text(
                                        text = "SERVIÇOS",
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = YellowGold
                                    )
                                }
                            }

                            // BOTÃO REAGENDAR
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(YellowGradient)
                                    .clickable {
                                        bookingToReschedule = booking
                                        newSelectedDate = booking.date
                                        newSelectedTime = booking.time
                                    }
                                    .padding(horizontal = 10.dp, vertical = 6.dp)
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        imageVector = Icons.Default.Schedule,
                                        contentDescription = null,
                                        tint = TextBlack,
                                        modifier = Modifier.size(12.dp)
                                    )
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text(
                                        text = "REAGENDAR",
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.ExtraBold,
                                        color = TextBlack
                                    )
                                }
                            }

                            // BOTÃO CANCELAR
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(CharcoalBg)
                                    .border(1.dp, CharcoalBorder, RoundedCornerShape(8.dp))
                                    .clickable { onCancelBooking(booking.id) }
                                    .padding(horizontal = 8.dp, vertical = 6.dp)
                            ) {
                                Text(
                                    text = "CANCELAR",
                                    fontSize = 10.sp,
                                    color = TextGray
                                )
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(12.dp))
            }
        }

        Spacer(modifier = Modifier.height(24.dp))
    }

    // DIALOG DE REAGENDAMENTO DE HORÁRIO
    if (bookingToReschedule != null) {
        Dialog(onDismissRequest = { bookingToReschedule = null }) {
            Surface(
                color = CharcoalSurface,
                shape = RoundedCornerShape(20.dp),
                border = androidx.compose.foundation.BorderStroke(1.dp, YellowGold.copy(alpha = 0.5f)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp)
            ) {
                Column(modifier = Modifier.padding(18.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.Schedule,
                                contentDescription = null,
                                tint = YellowGold,
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "REAGENDAR HORÁRIO",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = YellowGold
                            )
                        }
                        IconButton(onClick = { bookingToReschedule = null }) {
                            Icon(
                                imageVector = Icons.Default.Close,
                                contentDescription = "Fechar",
                                tint = TextGray,
                                modifier = Modifier.size(20.dp)
                            )
                        }
                    }

                    Text(
                        text = "Escolha a nova data e horário para seu atendimento:",
                        fontSize = 12.sp,
                        color = TextGray
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "1. Nova Data:",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = TextWhite
                    )
                    Spacer(modifier = Modifier.height(8.dp))

                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        contentPadding = PaddingValues(end = 8.dp)
                    ) {
                        items(dates) { dateOpt ->
                            val isSel = newSelectedDate?.id == dateOpt.id
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(if (isSel) YellowGradient else SolidColor(CharcoalCard))
                                    .border(1.dp, if (isSel) YellowGold else CharcoalBorder, RoundedCornerShape(10.dp))
                                    .clickable { newSelectedDate = dateOpt }
                                    .padding(horizontal = 12.dp, vertical = 8.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Text(
                                        text = dateOpt.dayOfWeek,
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = if (isSel) TextBlack else YellowGold
                                    )
                                    Text(
                                        text = "${dateOpt.dayNumber} ${dateOpt.month}",
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.ExtraBold,
                                        color = if (isSel) TextBlack else TextWhite
                                    )
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "2. Novo Horário:",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = TextWhite
                    )
                    Spacer(modifier = Modifier.height(8.dp))

                    val allSlots = shifts.flatMap { it.slots }
                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                        contentPadding = PaddingValues(end = 8.dp)
                    ) {
                        items(allSlots) { slot ->
                            val isSel = newSelectedTime == slot
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(if (isSel) YellowGradient else SolidColor(CharcoalCard))
                                    .border(1.dp, if (isSel) YellowGold else CharcoalBorder, RoundedCornerShape(8.dp))
                                    .clickable { newSelectedTime = slot }
                                    .padding(horizontal = 12.dp, vertical = 8.dp)
                            ) {
                                Text(
                                    text = slot,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = if (isSel) TextBlack else TextWhite
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        onClick = {
                            val targetBooking = bookingToReschedule
                            val date = newSelectedDate
                            val time = newSelectedTime
                            if (targetBooking != null && date != null && time != null) {
                                onUpdateBooking(
                                    targetBooking.copy(
                                        date = date,
                                        time = time
                                    )
                                )
                                Toast.makeText(
                                    context,
                                    "Agendamento reagendado para ${date.fullFormatted} às $time!",
                                    Toast.LENGTH_SHORT
                                ).show()
                                bookingToReschedule = null
                            }
                        },
                        enabled = newSelectedDate != null && newSelectedTime != null,
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = YellowGold,
                            contentColor = TextBlack
                        ),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Text(
                            text = "SALVAR NOVO HORÁRIO",
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 12.sp
                        )
                    }
                }
            }
        }
    }

    // DIALOG DE EDIÇÃO DE SERVIÇOS
    if (bookingToEditServices != null) {
        Dialog(onDismissRequest = { bookingToEditServices = null }) {
            Surface(
                color = CharcoalSurface,
                shape = RoundedCornerShape(20.dp),
                border = androidx.compose.foundation.BorderStroke(1.dp, YellowGold.copy(alpha = 0.5f)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp)
            ) {
                Column(modifier = Modifier.padding(18.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.ContentCut,
                                contentDescription = null,
                                tint = YellowGold,
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "EDITAR SERVIÇOS",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = YellowGold
                            )
                        }
                        IconButton(onClick = { bookingToEditServices = null }) {
                            Icon(
                                imageVector = Icons.Default.Close,
                                contentDescription = "Fechar",
                                tint = TextGray,
                                modifier = Modifier.size(20.dp)
                            )
                        }
                    }

                    Text(
                        text = "Selecione os serviços desejados para este agendamento:",
                        fontSize = 12.sp,
                        color = TextGray
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Column(
                        modifier = Modifier
                            .heightIn(max = 280.dp)
                            .verticalScroll(rememberScrollState()),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        allServices.forEach { service ->
                            val isSelected = editedServiceIds.contains(service.id)
                            Surface(
                                color = if (isSelected) CharcoalCardLight else CharcoalCard,
                                shape = RoundedCornerShape(12.dp),
                                border = androidx.compose.foundation.BorderStroke(
                                    1.dp,
                                    if (isSelected) YellowGold else CharcoalBorder
                                ),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable {
                                        editedServiceIds = if (isSelected) {
                                            editedServiceIds - service.id
                                        } else {
                                            editedServiceIds + service.id
                                        }
                                    }
                            ) {
                                Row(
                                    modifier = Modifier.padding(12.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Column(modifier = Modifier.weight(1f)) {
                                        Text(
                                            text = service.title,
                                            fontSize = 13.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = TextWhite
                                        )
                                        Text(
                                            text = service.description,
                                            fontSize = 11.sp,
                                            color = TextGray,
                                            maxLines = 1,
                                            overflow = TextOverflow.Ellipsis
                                        )
                                        Text(
                                            text = "R$ ${String.format("%.2f", service.price).replace('.', ',')}",
                                            fontSize = 12.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = YellowGold
                                        )
                                    }
                                    Checkbox(
                                        checked = isSelected,
                                        onCheckedChange = { checked ->
                                            editedServiceIds = if (checked) {
                                                editedServiceIds + service.id
                                            } else {
                                                editedServiceIds - service.id
                                            }
                                        },
                                        colors = CheckboxDefaults.colors(
                                            checkedColor = YellowGold,
                                            checkmarkColor = TextBlack,
                                            uncheckedColor = TextGray
                                        )
                                    )
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    val selectedServicesList = allServices.filter { it.id in editedServiceIds }
                    val newTotalPrice = selectedServicesList.sumOf { it.price }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Novo valor total:",
                            fontSize = 12.sp,
                            color = TextGray
                        )
                        Text(
                            text = "R$ ${String.format("%.2f", newTotalPrice).replace('.', ',')}",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = YellowGold
                        )
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    Button(
                        onClick = {
                            val targetBooking = bookingToEditServices
                            if (targetBooking != null && selectedServicesList.isNotEmpty()) {
                                onUpdateBooking(
                                    targetBooking.copy(
                                        services = selectedServicesList,
                                        totalPrice = newTotalPrice
                                    )
                                )
                                Toast.makeText(
                                    context,
                                    "Serviços atualizados com sucesso!",
                                    Toast.LENGTH_SHORT
                                ).show()
                                bookingToEditServices = null
                            }
                        },
                        enabled = selectedServicesList.isNotEmpty(),
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = YellowGold,
                            contentColor = TextBlack
                        ),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Text(
                            text = "SALVAR ALTERAÇÕES",
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 12.sp
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun LocationScreen(
    context: android.content.Context
) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(horizontal = 20.dp)
    ) {
        Spacer(modifier = Modifier.height(16.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.LocationOn,
                contentDescription = null,
                tint = YellowGold,
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "LOCALIZAÇÃO & CONTATO",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = YellowGold,
                letterSpacing = 1.sp
            )
        }

        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = "Venha nos visitar no coração da cidade",
            fontSize = 12.sp,
            color = TextGray
        )

        Spacer(modifier = Modifier.height(20.dp))

        // MAP PLACEHOLDER CARD
        Surface(
            color = CharcoalSurface,
            shape = RoundedCornerShape(16.dp),
            border = androidx.compose.foundation.BorderStroke(1.dp, CharcoalBorder),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(140.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(CharcoalCard),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            imageVector = Icons.Default.Map,
                            contentDescription = null,
                            tint = YellowGold,
                            modifier = Modifier.size(36.dp)
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(
                            text = "JADSON BARBER - CENTRO",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = TextWhite
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Row(verticalAlignment = Alignment.Top) {
                    Icon(
                        imageVector = Icons.Default.Place,
                        contentDescription = null,
                        tint = YellowGold,
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Column {
                        Text(
                            text = "Endereço",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = TextGray
                        )
                        Text(
                            text = "Rua Principal, 100 - Centro\nSão Paulo - SP, CEP 01000-000",
                            fontSize = 13.sp,
                            color = TextWhite
                        )
                    }
                }

                Spacer(modifier = Modifier.height(14.dp))

                Row(verticalAlignment = Alignment.Top) {
                    Icon(
                        imageVector = Icons.Default.AccessTime,
                        contentDescription = null,
                        tint = YellowGold,
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Column {
                        Text(
                            text = "Horário de Funcionamento",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = TextGray
                        )
                        Text(
                            text = "Segunda a Sábado: 08:00 às 20:00\nDomingos e Feriados: Fechado",
                            fontSize = 13.sp,
                            color = TextWhite
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(10.dp))
                            .background(CharcoalCard)
                            .border(1.dp, YellowGold.copy(alpha = 0.5f), RoundedCornerShape(10.dp))
                            .clickable {
                                Toast.makeText(context, "Ligando para (11) 99999-8888...", Toast.LENGTH_SHORT).show()
                            }
                            .padding(vertical = 10.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.Phone,
                                contentDescription = null,
                                tint = YellowGold,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = "LIGAR",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = YellowGold
                            )
                        }
                    }

                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(10.dp))
                            .background(YellowGradient)
                            .clickable {
                                Toast.makeText(context, "Abrindo conversa no WhatsApp...", Toast.LENGTH_SHORT).show()
                            }
                            .padding(vertical = 10.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "WHATSAPP",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = TextBlack
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))
    }
}

data class FeedPostItem(
    val id: String,
    val barberName: String,
    val barberRole: String,
    val timeAgo: String,
    val title: String,
    val description: String,
    val styleBadge: String,
    val tags: List<String>,
    val likeCount: Int,
    val isLiked: Boolean
)

@Composable
private fun FeedScreen(
    onSelectStyleToSchedule: (String) -> Unit
) {
    val posts = remember {
        mutableStateListOf(
            FeedPostItem(
                id = "1",
                barberName = "Jadson Barber",
                barberRole = "Mestre Barbeiro",
                timeAgo = "Há 2 horas",
                title = "Degradê Mid Fade Navalhado & Pigmentação",
                description = "Corte moderno com transição suave do disfarçado médio, acabamento na navalha afiada e leve pigmentação para definir o contorno frontal. Finalizado com pomada mate.",
                styleBadge = "CORTE DO DIA",
                tags = listOf("#MidFade", "#Navalhado", "#BarberLife"),
                likeCount = 142,
                isLiked = false
            ),
            FeedPostItem(
                id = "2",
                barberName = "Lucas Silva",
                barberRole = "Especialista em Degradê",
                timeAgo = "Há 5 horas",
                title = "Barba Laranja Imperial com Toalha Quente",
                description = "Ritual completo de barboterapia: alinhamento de simetria facial, hidratação com óleos essenciais e toalha quente vaporizada antes da navalha.",
                styleBadge = "BARBOTERAPIA",
                tags = listOf("#BarbaLumber", "#ToalhaQuente", "#Barboterapia"),
                likeCount = 98,
                isLiked = false
            ),
            FeedPostItem(
                id = "3",
                barberName = "Mateus Costa",
                barberRole = "Especialista em Clássicos",
                timeAgo = "Ontem às 18:30",
                title = "Mullet Disfarçado & Freestyle Lateral",
                description = "Uma releitura urbana e arrojada do clássico mullet com degradê baixo nas laterais e risca personalizada na navalha.",
                styleBadge = "TENDÊNCIA 2026",
                tags = listOf("#MulletModerno", "#Freestyle", "#ArteEmCabelo"),
                likeCount = 215,
                isLiked = true
            ),
            FeedPostItem(
                id = "4",
                barberName = "Jadson Barber",
                barberRole = "Mestre Barbeiro",
                timeAgo = "Há 2 dias",
                title = "Nevou Platinum Clássico + Pezinho Zero",
                description = "Descoloração global em tom platinado pérola mantendo a saúde do couro cabeludo com protetor térmico e matização exclusiva.",
                styleBadge = "NEVOU PLATINUM",
                tags = listOf("#Nevou", "#Platinado", "#StyleBarber"),
                likeCount = 310,
                isLiked = false
            )
        )
    }

    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(horizontal = 20.dp)
    ) {
        Spacer(modifier = Modifier.height(16.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.PhotoLibrary,
                contentDescription = null,
                tint = YellowGold,
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "FEED DE ESTILOS & TENDÊNCIAS",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = YellowGold,
                letterSpacing = 1.sp
            )
        }

        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = "Inspirações, cortes em alta e transformações da Jadson Barber",
            fontSize = 12.sp,
            color = TextGray
        )

        Spacer(modifier = Modifier.height(20.dp))

        posts.forEachIndexed { index, post ->
            Surface(
                color = CharcoalSurface,
                shape = RoundedCornerShape(16.dp),
                border = androidx.compose.foundation.BorderStroke(1.dp, CharcoalBorder),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    // Header of the Post (Barber info)
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(42.dp)
                                .clip(CircleShape)
                                .background(YellowGradient)
                                .border(1.dp, YellowGold, CircleShape),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.ContentCut,
                                contentDescription = null,
                                tint = TextBlack,
                                modifier = Modifier.size(20.dp)
                            )
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = post.barberName,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = TextWhite
                            )
                            Text(
                                text = "${post.barberRole} • ${post.timeAgo}",
                                fontSize = 11.sp,
                                color = TextGray
                            )
                        }

                        Surface(
                            color = YellowGold.copy(alpha = 0.15f),
                            shape = RoundedCornerShape(8.dp),
                            border = androidx.compose.foundation.BorderStroke(1.dp, YellowGold.copy(alpha = 0.3f))
                        ) {
                            Text(
                                text = post.styleBadge,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                color = YellowGold,
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // Simulated Photo Container with Stylized Gradient & Barber Icon Visual
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(180.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .background(
                                Brush.verticalGradient(
                                    listOf(CharcoalCardLight, CharcoalBg)
                                )
                            )
                            .border(1.dp, CharcoalBorder, RoundedCornerShape(12.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        // Background watermark pattern
                        Icon(
                            imageVector = Icons.Default.ContentCut,
                            contentDescription = null,
                            tint = YellowGold.copy(alpha = 0.08f),
                            modifier = Modifier.size(120.dp)
                        )

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(16.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(56.dp)
                                    .clip(CircleShape)
                                    .background(CharcoalSurface)
                                    .border(1.dp, YellowGold, CircleShape),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = Icons.Default.ContentCut,
                                    contentDescription = null,
                                    tint = YellowGold,
                                    modifier = Modifier.size(28.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = post.title,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = TextWhite,
                                textAlign = androidx.compose.ui.text.style.TextAlign.Center
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = post.description,
                        fontSize = 12.sp,
                        color = TextGray,
                        lineHeight = 18.sp
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    // Tags row
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        post.tags.forEach { tag ->
                            Text(
                                text = tag,
                                fontSize = 11.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = YellowGold
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // ACTION BAR: SCISSORS LIKE BUTTON (Tesoura ao invés de coração)
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Scissors Like Button (Tesoura para curtir)
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .background(
                                    if (post.isLiked) YellowGold.copy(alpha = 0.2f) else CharcoalCard
                                )
                                .border(
                                    1.dp,
                                    if (post.isLiked) YellowGold else CharcoalBorder,
                                    RoundedCornerShape(10.dp)
                                )
                                .clickable {
                                    val newIsLiked = !post.isLiked
                                    val newCount = if (newIsLiked) post.likeCount + 1 else post.likeCount - 1
                                    posts[index] = post.copy(isLiked = newIsLiked, likeCount = newCount)
                                }
                                .padding(horizontal = 12.dp, vertical = 8.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.ContentCut,
                                contentDescription = "Curtir estilo com tesoura",
                                tint = if (post.isLiked) YellowGold else TextGray,
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = if (post.isLiked) "Curtido (${post.likeCount})" else "${post.likeCount}",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = if (post.isLiked) YellowGold else TextGray
                            )
                        }

                        // Schedule this style button
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .background(YellowGradient)
                                .clickable { onSelectStyleToSchedule(post.title) }
                                .padding(horizontal = 14.dp, vertical = 8.dp)
                        ) {
                            Text(
                                text = "AGENDAR ESTILO",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.ExtraBold,
                                color = TextBlack
                            )
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(14.dp))
        }

        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Composable
private fun BottomQuickAccessBar(
    activeDestination: DrawerDestination,
    onNavigate: (DrawerDestination) -> Unit
) {
    Surface(
        color = Color.Black,
        tonalElevation = 12.dp,
        border = androidx.compose.foundation.BorderStroke(
            1.dp,
            YellowGold.copy(alpha = 0.35f)
        ),
        shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp, horizontal = 4.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            BottomNavItem(
                icon = Icons.Default.CalendarToday,
                label = "Agendar",
                isSelected = activeDestination == DrawerDestination.AGENDA,
                onClick = { onNavigate(DrawerDestination.AGENDA) }
            )
            BottomNavItem(
                icon = Icons.Default.EventAvailable,
                label = "Agendamentos",
                isSelected = activeDestination == DrawerDestination.MY_BOOKINGS,
                onClick = { onNavigate(DrawerDestination.MY_BOOKINGS) }
            )
            BottomNavItem(
                icon = Icons.Default.PhotoLibrary,
                label = "Feed",
                isSelected = activeDestination == DrawerDestination.FEED,
                onClick = { onNavigate(DrawerDestination.FEED) }
            )
            BottomNavItem(
                icon = Icons.Default.AccountCircle,
                label = "Perfil",
                isSelected = activeDestination == DrawerDestination.PROFILE,
                onClick = { onNavigate(DrawerDestination.PROFILE) }
            )
        }
    }
}

@Composable
private fun BottomNavItem(
    icon: ImageVector,
    label: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    val scale by animateFloatAsState(
        targetValue = if (isSelected) 1.12f else 1.0f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessLow
        ),
        label = "BottomNavItemScale"
    )

    val bgModifier = if (isSelected) {
        Modifier.background(YellowGradient)
    } else {
        Modifier.background(Color(0xFF141414))
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .clickable { onClick() }
            .padding(horizontal = 6.dp, vertical = 4.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .graphicsLayer {
                    scaleX = scale
                    scaleY = scale
                }
                .size(38.dp)
                .clip(CircleShape)
                .then(bgModifier)
                .border(
                    width = 1.dp,
                    color = if (isSelected) YellowGold else YellowGold.copy(alpha = 0.35f),
                    shape = CircleShape
                )
        ) {
            Icon(
                imageVector = icon,
                contentDescription = label,
                tint = if (isSelected) TextBlack else YellowGold,
                modifier = Modifier.size(18.dp)
            )
        }
        Spacer(modifier = Modifier.height(3.dp))
        Text(
            text = label,
            fontSize = 10.sp,
            fontWeight = if (isSelected) FontWeight.ExtraBold else FontWeight.Medium,
            color = if (isSelected) YellowGold else YellowGold.copy(alpha = 0.85f),
            maxLines = 1
        )
    }
}

@Composable
private fun AuthDialog(
    onDismiss: () -> Unit,
    registeredUsers: List<UserAccount>,
    onRegisterUser: (UserAccount) -> Unit,
    onLoginSuccess: (UserAccount) -> Unit,
    onOpenAdminPanel: () -> Unit
) {
    var selectedTab by remember { mutableIntStateOf(0) }
    var scissorTapCount by remember { mutableIntStateOf(0) }
    val context = androidx.compose.ui.platform.LocalContext.current

    var loginInput by remember { mutableStateOf("") }
    var loginPassword by remember { mutableStateOf("") }
    var loginPasswordVisible by remember { mutableStateOf(false) }
    var loginError by remember { mutableStateOf<String?>(null) }

    var regFullName by remember { mutableStateOf("") }
    var regPhone by remember { mutableStateOf("") }
    var regEmail by remember { mutableStateOf("") }
    var regPassword by remember { mutableStateOf("") }
    var regConfirmPassword by remember { mutableStateOf("") }
    var regPasswordVisible by remember { mutableStateOf(false) }
    var regError by remember { mutableStateOf<String?>(null) }

    Dialog(onDismissRequest = onDismiss) {
        Surface(
            color = CharcoalSurface,
            shape = RoundedCornerShape(24.dp),
            border = androidx.compose.foundation.BorderStroke(1.5.dp, YellowGold.copy(alpha = 0.6f)),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(20.dp)
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Header with Scissors Badge and Close Button
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                                .background(YellowGold.copy(alpha = 0.15f))
                                .border(1.5.dp, YellowGold, CircleShape)
                                .clickable {
                                    scissorTapCount++
                                    if (scissorTapCount >= 5) {
                                        android.widget.Toast.makeText(context, "🔑 Painel Administrativo Acessado!", android.widget.Toast.LENGTH_SHORT).show()
                                        onOpenAdminPanel()
                                    } else if (scissorTapCount >= 2) {
                                        android.widget.Toast.makeText(context, "Toque mais ${5 - scissorTapCount}x para o Painel Admin", android.widget.Toast.LENGTH_SHORT).show()
                                    }
                                },
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.ContentCut,
                                contentDescription = "Barbearia",
                                tint = YellowGold,
                                modifier = Modifier.size(20.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Text(
                                text = "BARBEARIA JADSON BARBER",
                                fontSize = 10.sp,
                                fontWeight = FontWeight.ExtraBold,
                                color = YellowGold,
                                letterSpacing = 1.1.sp
                            )
                            Text(
                                text = if (selectedTab == 0) "Acesse sua Conta" else "Crie sua Conta",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = TextWhite
                            )
                        }
                    }

                    IconButton(
                        onClick = onDismiss,
                        modifier = Modifier
                            .size(32.dp)
                            .clip(CircleShape)
                            .background(CharcoalBg)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Fechar",
                            tint = TextGray,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(18.dp))

                // Tab Selector (Entrar / Cadastrar)
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(14.dp))
                        .background(CharcoalBg)
                        .border(1.dp, CharcoalBorder, RoundedCornerShape(14.dp))
                        .padding(4.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(10.dp))
                            .background(if (selectedTab == 0) YellowGradient else SolidColor(Color.Transparent))
                            .clickable {
                                selectedTab = 0
                                loginError = null
                            }
                            .padding(vertical = 10.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.Login,
                                contentDescription = null,
                                tint = if (selectedTab == 0) TextBlack else TextGray,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = "ENTRAR",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.ExtraBold,
                                letterSpacing = 0.5.sp,
                                color = if (selectedTab == 0) TextBlack else TextGray
                            )
                        }
                    }

                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(10.dp))
                            .background(if (selectedTab == 1) YellowGradient else SolidColor(Color.Transparent))
                            .clickable {
                                selectedTab = 1
                                regError = null
                            }
                            .padding(vertical = 10.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.PersonAdd,
                                contentDescription = null,
                                tint = if (selectedTab == 1) TextBlack else TextGray,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = "CADASTRAR",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.ExtraBold,
                                letterSpacing = 0.5.sp,
                                color = if (selectedTab == 1) TextBlack else TextGray
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                if (selectedTab == 0) {
                    // LOGIN FORM
                    OutlinedTextField(
                        value = loginInput,
                        onValueChange = { loginInput = it; loginError = null },
                        label = { Text("WhatsApp, E-mail ou Código") },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = null,
                                tint = YellowGold,
                                modifier = Modifier.size(20.dp)
                            )
                        },
                        singleLine = true,
                        shape = RoundedCornerShape(12.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedContainerColor = CharcoalBg,
                            unfocusedContainerColor = CharcoalBg,
                            focusedBorderColor = YellowGold,
                            unfocusedBorderColor = CharcoalBorder,
                            focusedLabelColor = YellowGold,
                            unfocusedLabelColor = TextGray,
                            focusedTextColor = TextWhite,
                            unfocusedTextColor = TextWhite
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    OutlinedTextField(
                        value = loginPassword,
                        onValueChange = { loginPassword = it; loginError = null },
                        label = { Text("Senha") },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Lock,
                                contentDescription = null,
                                tint = YellowGold,
                                modifier = Modifier.size(20.dp)
                            )
                        },
                        singleLine = true,
                        shape = RoundedCornerShape(12.dp),
                        visualTransformation = if (loginPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                        trailingIcon = {
                            IconButton(onClick = { loginPasswordVisible = !loginPasswordVisible }) {
                                Icon(
                                    imageVector = if (loginPasswordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                                    contentDescription = null,
                                    tint = TextGray,
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedContainerColor = CharcoalBg,
                            unfocusedContainerColor = CharcoalBg,
                            focusedBorderColor = YellowGold,
                            unfocusedBorderColor = CharcoalBorder,
                            focusedLabelColor = YellowGold,
                            unfocusedLabelColor = TextGray,
                            focusedTextColor = TextWhite,
                            unfocusedTextColor = TextWhite
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )

                    if (loginError != null) {
                        Spacer(modifier = Modifier.height(10.dp))
                        Surface(
                            color = Color(0x22FF5555),
                            shape = RoundedCornerShape(8.dp),
                            border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFFF5555).copy(alpha = 0.5f)),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = loginError!!,
                                color = Color(0xFFFF7777),
                                fontSize = 12.sp,
                                modifier = Modifier.padding(10.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        onClick = {
                            val trimmedInput = loginInput.trim()
                            if (trimmedInput.isBlank() || loginPassword.isBlank()) {
                                loginError = "Preencha o usuário e a senha."
                                return@Button
                            }
                            val found = registeredUsers.find {
                                it.phone.equals(trimmedInput, ignoreCase = true) ||
                                (it.email != null && it.email.equals(trimmedInput, ignoreCase = true)) ||
                                it.clientCode.equals(trimmedInput, ignoreCase = true)
                            }
                            if (found != null && found.password == loginPassword) {
                                onLoginSuccess(found)
                            } else if (registeredUsers.isEmpty()) {
                                val sampleCode = generateClientCode()
                                val newAcc = UserAccount(
                                    fullName = if (trimmedInput.contains(" ")) trimmedInput else "Cliente $trimmedInput",
                                    phone = trimmedInput,
                                    email = null,
                                    password = loginPassword,
                                    clientCode = sampleCode
                                )
                                onRegisterUser(newAcc)
                                onLoginSuccess(newAcc)
                            } else {
                                loginError = "Dados incorretos ou conta não cadastrada. Alterne para a aba Cadastrar."
                            }
                        },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = YellowGold,
                            contentColor = TextBlack
                        ),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.ContentCut,
                                contentDescription = null,
                                tint = TextBlack,
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "ENTRAR NA CONTA",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 13.sp,
                                letterSpacing = 0.5.sp
                            )
                        }
                    }
                } else {
                    // REGISTER FORM
                    Text(
                        text = "Preencha seus dados para criar sua conta:",
                        fontSize = 12.sp,
                        color = TextGray,
                        modifier = Modifier.align(Alignment.Start)
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    OutlinedTextField(
                        value = regFullName,
                        onValueChange = { regFullName = it; regError = null },
                        label = { Text("Nome completo *") },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = null,
                                tint = YellowGold,
                                modifier = Modifier.size(20.dp)
                            )
                        },
                        singleLine = true,
                        shape = RoundedCornerShape(12.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedContainerColor = CharcoalBg,
                            unfocusedContainerColor = CharcoalBg,
                            focusedBorderColor = YellowGold,
                            unfocusedBorderColor = CharcoalBorder,
                            focusedLabelColor = YellowGold,
                            unfocusedLabelColor = TextGray,
                            focusedTextColor = TextWhite,
                            unfocusedTextColor = TextWhite
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    OutlinedTextField(
                        value = regPhone,
                        onValueChange = { regPhone = it; regError = null },
                        label = { Text("Telefone / Whatsapp *") },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Phone,
                                contentDescription = null,
                                tint = YellowGold,
                                modifier = Modifier.size(20.dp)
                            )
                        },
                        singleLine = true,
                        shape = RoundedCornerShape(12.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedContainerColor = CharcoalBg,
                            unfocusedContainerColor = CharcoalBg,
                            focusedBorderColor = YellowGold,
                            unfocusedBorderColor = CharcoalBorder,
                            focusedLabelColor = YellowGold,
                            unfocusedLabelColor = TextGray,
                            focusedTextColor = TextWhite,
                            unfocusedTextColor = TextWhite
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    OutlinedTextField(
                        value = regEmail,
                        onValueChange = { regEmail = it; regError = null },
                        label = { Text("Email (opcional)") },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Email,
                                contentDescription = null,
                                tint = YellowGold,
                                modifier = Modifier.size(20.dp)
                            )
                        },
                        singleLine = true,
                        shape = RoundedCornerShape(12.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedContainerColor = CharcoalBg,
                            unfocusedContainerColor = CharcoalBg,
                            focusedBorderColor = YellowGold,
                            unfocusedBorderColor = CharcoalBorder,
                            focusedLabelColor = YellowGold,
                            unfocusedLabelColor = TextGray,
                            focusedTextColor = TextWhite,
                            unfocusedTextColor = TextWhite
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    OutlinedTextField(
                        value = regPassword,
                        onValueChange = { regPassword = it; regError = null },
                        label = { Text("Senha *") },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Lock,
                                contentDescription = null,
                                tint = YellowGold,
                                modifier = Modifier.size(20.dp)
                            )
                        },
                        singleLine = true,
                        shape = RoundedCornerShape(12.dp),
                        visualTransformation = if (regPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                        trailingIcon = {
                            IconButton(onClick = { regPasswordVisible = !regPasswordVisible }) {
                                Icon(
                                    imageVector = if (regPasswordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                                    contentDescription = null,
                                    tint = TextGray,
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedContainerColor = CharcoalBg,
                            unfocusedContainerColor = CharcoalBg,
                            focusedBorderColor = YellowGold,
                            unfocusedBorderColor = CharcoalBorder,
                            focusedLabelColor = YellowGold,
                            unfocusedLabelColor = TextGray,
                            focusedTextColor = TextWhite,
                            unfocusedTextColor = TextWhite
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    OutlinedTextField(
                        value = regConfirmPassword,
                        onValueChange = { regConfirmPassword = it; regError = null },
                        label = { Text("Confirmar Senha *") },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Lock,
                                contentDescription = null,
                                tint = YellowGold,
                                modifier = Modifier.size(20.dp)
                            )
                        },
                        singleLine = true,
                        shape = RoundedCornerShape(12.dp),
                        visualTransformation = if (regPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedContainerColor = CharcoalBg,
                            unfocusedContainerColor = CharcoalBg,
                            focusedBorderColor = YellowGold,
                            unfocusedBorderColor = CharcoalBorder,
                            focusedLabelColor = YellowGold,
                            unfocusedLabelColor = TextGray,
                            focusedTextColor = TextWhite,
                            unfocusedTextColor = TextWhite
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )

                    if (regError != null) {
                        Spacer(modifier = Modifier.height(10.dp))
                        Surface(
                            color = Color(0x22FF5555),
                            shape = RoundedCornerShape(8.dp),
                            border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFFF5555).copy(alpha = 0.5f)),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = regError!!,
                                color = Color(0xFFFF7777),
                                fontSize = 12.sp,
                                modifier = Modifier.padding(10.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    Surface(
                        color = CharcoalCard,
                        shape = RoundedCornerShape(12.dp),
                        border = androidx.compose.foundation.BorderStroke(1.dp, YellowGold.copy(alpha = 0.35f)),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.padding(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(32.dp)
                                    .clip(CircleShape)
                                    .background(YellowGold.copy(alpha = 0.15f)),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Badge,
                                    contentDescription = null,
                                    tint = YellowGold,
                                    modifier = Modifier.size(18.dp)
                                )
                            }
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                text = "Ao se cadastrar, você receberá um Código do Cliente exclusivo com 3 dígitos e 1 letra para identificação rápida na barbearia.",
                                fontSize = 11.sp,
                                color = TextGray,
                                lineHeight = 15.sp
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(18.dp))

                    Button(
                        onClick = {
                            val name = regFullName.trim()
                            val phone = regPhone.trim()
                            val email = regEmail.trim().ifBlank { null }
                            val pwd = regPassword
                            val pwdConf = regConfirmPassword

                            if (name.isBlank()) {
                                regError = "Por favor, informe seu nome completo."
                                return@Button
                            }
                            if (phone.isBlank()) {
                                regError = "Por favor, informe seu Telefone / Whatsapp."
                                return@Button
                            }
                            if (pwd.length < 3) {
                                regError = "Informe uma senha com no mínimo 3 caracteres."
                                return@Button
                            }
                            if (pwd != pwdConf) {
                                regError = "As senhas não coincidem!"
                                return@Button
                            }

                            val newCode = generateClientCode()
                            val newUser = UserAccount(
                                fullName = name,
                                phone = phone,
                                email = email,
                                password = pwd,
                                clientCode = newCode
                            )
                            onRegisterUser(newUser)
                            onLoginSuccess(newUser)
                        },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = YellowGold,
                            contentColor = TextBlack
                        ),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.ContentCut,
                                contentDescription = null,
                                tint = TextBlack,
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "CONCLUIR CADASTRO",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 13.sp,
                                letterSpacing = 0.5.sp
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun ProfileScreen(
    currentUser: UserAccount?,
    confirmedBookings: List<ConfirmedBooking>,
    onOpenAuth: () -> Unit,
    onLogout: () -> Unit,
    onNavigateToBookings: () -> Unit,
    onNavigateToAgenda: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        // Section Title
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(42.dp)
                    .clip(CircleShape)
                    .background(YellowGold.copy(alpha = 0.2f))
                    .border(1.dp, YellowGold, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = null,
                    tint = YellowGold,
                    modifier = Modifier.size(24.dp)
                )
            }

            Column {
                Text(
                    text = "PERFIL DO CLIENTE",
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                    color = YellowGold,
                    letterSpacing = 1.2.sp
                )
                Text(
                    text = if (currentUser != null) currentUser.fullName else "Conta do Cliente",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = TextWhite
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        if (currentUser != null) {
            // Logged in Profile Card
            Surface(
                color = CharcoalSurface,
                shape = RoundedCornerShape(20.dp),
                border = androidx.compose.foundation.BorderStroke(1.5.dp, YellowGold.copy(alpha = 0.6f)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .size(70.dp)
                            .clip(CircleShape)
                            .background(YellowGradient)
                            .border(2.dp, YellowGold, CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.ContentCut,
                            contentDescription = null,
                            tint = TextBlack,
                            modifier = Modifier.size(36.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = currentUser.fullName,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = TextWhite
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    // Client Code Badge
                    Surface(
                        color = CharcoalBg,
                        shape = RoundedCornerShape(12.dp),
                        border = androidx.compose.foundation.BorderStroke(1.dp, YellowGold),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier.padding(14.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "CÓDIGO DE IDENTIFICAÇÃO DO CLIENTE",
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                color = YellowGold,
                                letterSpacing = 1.2.sp
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = currentUser.clientCode,
                                fontSize = 26.sp,
                                fontWeight = FontWeight.Black,
                                color = YellowGold,
                                letterSpacing = 2.sp
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = "Apresente este código na barbearia para rápida identificação",
                                fontSize = 10.sp,
                                color = TextGray,
                                textAlign = androidx.compose.ui.text.style.TextAlign.Center
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    // Details
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.Phone,
                                contentDescription = null,
                                tint = YellowGold,
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                text = "WhatsApp: ${currentUser.phone}",
                                fontSize = 13.sp,
                                color = TextWhite
                            )
                        }

                        if (!currentUser.email.isNullOrBlank()) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Default.Email,
                                    contentDescription = null,
                                    tint = YellowGold,
                                    modifier = Modifier.size(18.dp)
                                )
                                Spacer(modifier = Modifier.width(10.dp))
                                Text(
                                    text = "E-mail: ${currentUser.email}",
                                    fontSize = 13.sp,
                                    color = TextWhite
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    // Stats summary
                    val myBookings = confirmedBookings.filter { it.clientCode == currentUser.clientCode || it.clientName == currentUser.fullName }
                    Surface(
                        color = CharcoalCard,
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(14.dp),
                            horizontalArrangement = Arrangement.SpaceAround,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = "${myBookings.size}",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.ExtraBold,
                                    color = YellowGold
                                )
                                Text(
                                    text = "Agendamentos",
                                    fontSize = 11.sp,
                                    color = TextGray
                                )
                            }

                            Box(
                                modifier = Modifier
                                    .width(1.dp)
                                    .height(28.dp)
                                    .background(CharcoalBorder)
                            )

                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = "Ativo",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFF4CAF50)
                                )
                                Text(
                                    text = "Status do Cliente",
                                    fontSize = 11.sp,
                                    color = TextGray
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    // Actions
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(12.dp))
                                .background(YellowGradient)
                                .clickable { onNavigateToBookings() }
                                .padding(vertical = 12.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "VER AGENDAMENTOS",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.ExtraBold,
                                color = TextBlack
                            )
                        }

                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(12.dp))
                                .background(CharcoalBg)
                                .border(1.dp, YellowGold.copy(alpha = 0.5f), RoundedCornerShape(12.dp))
                                .clickable { onNavigateToAgenda() }
                                .padding(vertical = 12.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "+ NOVO HORÁRIO",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.ExtraBold,
                                color = YellowGold
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    // Logout Button
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(12.dp))
                            .background(Color(0x22FF5555))
                            .border(1.dp, Color(0xFFFF5555).copy(alpha = 0.5f), RoundedCornerShape(12.dp))
                            .clickable { onLogout() }
                            .padding(vertical = 12.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Logout,
                            contentDescription = null,
                            tint = Color(0xFFFF7777),
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "SAIR DA CONTA",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = Color(0xFFFF7777)
                        )
                    }
                }
            }
        } else {
            // Not Logged In View
            Surface(
                color = CharcoalSurface,
                shape = RoundedCornerShape(20.dp),
                border = androidx.compose.foundation.BorderStroke(1.dp, YellowGold.copy(alpha = 0.5f)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .background(YellowGold.copy(alpha = 0.15f))
                            .border(1.5.dp, YellowGold, CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = null,
                            tint = YellowGold,
                            modifier = Modifier.size(32.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "Você não está conectado",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = TextWhite
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Faça login ou cadastre-se para acessar seu Código de Cliente exclusivo, histórico de agendamentos e atendimento personalizado na Barbearia Jadson Barber.",
                        fontSize = 12.sp,
                        color = TextGray,
                        textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                        lineHeight = 16.sp
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(12.dp))
                            .background(YellowGradient)
                            .clickable { onOpenAuth() }
                            .padding(vertical = 14.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.Login,
                                contentDescription = null,
                                tint = TextBlack,
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "ENTRAR OU CADASTRAR-SE",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.ExtraBold,
                                color = TextBlack
                            )
                        }
                    }
                }
            }
        }
    }
}

// ============================================================================
// BARBER SHOP ADMIN PANEL (PAINEL ADMINISTRATIVO DA BARBEARIA)
// ============================================================================

@Composable
private fun AdminPanelScreen(
    confirmedBookings: List<ConfirmedBooking>,
    registeredUsers: List<UserAccount>,
    allServices: List<BarberService>,
    teamBarbers: List<TeamBarberItem>,
    couponsList: List<CouponItem>,
    operatingSchedules: List<OperatingScheduleItem>,
    feedPosts: List<FeedPostItem>,
    adminSettings: AdminSettings,
    onUpdateBookings: (List<ConfirmedBooking>) -> Unit,
    onUpdateUsers: (List<UserAccount>) -> Unit,
    onUpdateTeamBarbers: (List<TeamBarberItem>) -> Unit,
    onUpdateCoupons: (List<CouponItem>) -> Unit,
    onUpdateOperatingSchedules: (List<OperatingScheduleItem>) -> Unit,
    onUpdateFeedPosts: (List<FeedPostItem>) -> Unit,
    onUpdateAdminSettings: (AdminSettings) -> Unit,
    onBackToApp: () -> Unit
) {
    var selectedTab by remember { mutableIntStateOf(0) }
    val context = androidx.compose.ui.platform.LocalContext.current

    // Dialog States
    var showNewBookingDialog by remember { mutableStateOf(false) }
    var showNewClientDialog by remember { mutableStateOf(false) }
    var showNewBarberDialog by remember { mutableStateOf(false) }
    var showNewCouponDialog by remember { mutableStateOf(false) }
    var showNewPostDialog by remember { mutableStateOf(false) }

    val adminTabs = listOf(
        "Dashboard",
        "Financeiro",
        "Agendamentos",
        "Clientes",
        "Equipe",
        "Feed",
        "Cupom de Desconto",
        "Horários",
        "Configurações"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(CharcoalBg)
    ) {
        // Top Admin Bar
        Surface(
            color = CharcoalSurface,
            tonalElevation = 6.dp,
            border = androidx.compose.foundation.BorderStroke(0.5.dp, YellowGold.copy(alpha = 0.4f)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(38.dp)
                            .clip(CircleShape)
                            .background(YellowGradient),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.AdminPanelSettings,
                            contentDescription = "Painel Admin",
                            tint = TextBlack,
                            modifier = Modifier.size(22.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "PAINEL ADMINISTRATIVO",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.ExtraBold,
                                color = YellowGold,
                                letterSpacing = 1.1.sp
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(4.dp))
                                    .background(Color(0xFF4CAF50))
                                    .padding(horizontal = 4.dp, vertical = 1.dp)
                            ) {
                                Text("EM TEMPO REAL", fontSize = 8.sp, fontWeight = FontWeight.Bold, color = TextBlack)
                            }
                        }
                        Text(
                            text = adminSettings.shopName,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = TextWhite
                        )
                    }
                }

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(CharcoalBg)
                        .border(1.dp, YellowGold.copy(alpha = 0.6f), RoundedCornerShape(10.dp))
                        .clickable { onBackToApp() }
                        .padding(horizontal = 10.dp, vertical = 6.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Sair do Admin",
                            tint = YellowGold,
                            modifier = Modifier.size(14.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "APP CLIENTE",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                            color = YellowGold
                        )
                    }
                }
            }
        }

        // Horizontal Scrollable Tabs Header
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .background(CharcoalSurface.copy(alpha = 0.8f))
                .padding(vertical = 10.dp, horizontal = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            itemsIndexed(adminTabs) { index, title ->
                val isSelected = selectedTab == index
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(20.dp))
                        .background(if (isSelected) YellowGold else CharcoalCard)
                        .border(
                            1.dp,
                            if (isSelected) YellowGold else CharcoalBorder,
                            RoundedCornerShape(20.dp)
                        )
                        .clickable { selectedTab = index }
                        .padding(horizontal = 14.dp, vertical = 8.dp)
                ) {
                    Text(
                        text = title,
                        fontSize = 12.sp,
                        fontWeight = if (isSelected) FontWeight.ExtraBold else FontWeight.Medium,
                        color = if (isSelected) TextBlack else TextWhite
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(1.dp))

        // Content Body Based on Selected Tab
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(16.dp)
        ) {
            when (selectedTab) {
                0 -> AdminDashboardTab(
                    bookings = confirmedBookings,
                    users = registeredUsers,
                    barbers = teamBarbers,
                    onNewBooking = { showNewBookingDialog = true },
                    onNewCoupon = { showNewCouponDialog = true },
                    onTabSelect = { selectedTab = it },
                    onStatusChange = { bookingId, newStatus ->
                        val updated = confirmedBookings.map {
                            if (it.id == bookingId) it.copy(status = newStatus) else it
                        }
                        onUpdateBookings(updated)
                    }
                )
                1 -> AdminFinanceTab(
                    bookings = confirmedBookings,
                    services = allServices,
                    barbers = teamBarbers
                )
                2 -> AdminBookingsTab(
                    bookings = confirmedBookings,
                    barbers = teamBarbers,
                    services = allServices,
                    onNewBookingClick = { showNewBookingDialog = true },
                    onStatusChange = { bookingId, newStatus ->
                        val updated = confirmedBookings.map {
                            if (it.id == bookingId) it.copy(status = newStatus) else it
                        }
                        onUpdateBookings(updated)
                    },
                    onDeleteBooking = { bookingId ->
                        val updated = confirmedBookings.filter { it.id != bookingId }
                        onUpdateBookings(updated)
                        android.widget.Toast.makeText(context, "Agendamento removido.", android.widget.Toast.LENGTH_SHORT).show()
                    }
                )
                3 -> AdminClientsTab(
                    users = registeredUsers,
                    bookings = confirmedBookings,
                    onAddClientClick = { showNewClientDialog = true }
                )
                4 -> AdminTeamTab(
                    barbers = teamBarbers,
                    onAddBarberClick = { showNewBarberDialog = true },
                    onToggleActive = { barberId ->
                        val updated = teamBarbers.map {
                            if (it.id == barberId) it.copy(isActive = !it.isActive) else it
                        }
                        onUpdateTeamBarbers(updated)
                    },
                    onDeleteBarber = { barberId ->
                        val updated = teamBarbers.filter { it.id != barberId }
                        onUpdateTeamBarbers(updated)
                    }
                )
                5 -> AdminFeedTab(
                    feedPosts = feedPosts,
                    onAddPostClick = { showNewPostDialog = true },
                    onDeletePost = { postId ->
                        val updated = feedPosts.filter { it.id != postId }
                        onUpdateFeedPosts(updated)
                        android.widget.Toast.makeText(context, "Post removido do feed.", android.widget.Toast.LENGTH_SHORT).show()
                    }
                )
                6 -> AdminCouponsTab(
                    coupons = couponsList,
                    onAddCouponClick = { showNewCouponDialog = true },
                    onToggleActive = { couponId ->
                        val updated = couponsList.map {
                            if (it.id == couponId) it.copy(isActive = !it.isActive) else it
                        }
                        onUpdateCoupons(updated)
                    },
                    onDeleteCoupon = { couponId ->
                        val updated = couponsList.filter { it.id != couponId }
                        onUpdateCoupons(updated)
                    }
                )
                7 -> AdminScheduleTab(
                    schedules = operatingSchedules,
                    onScheduleUpdate = { updatedSchedules ->
                        onUpdateOperatingSchedules(updatedSchedules)
                    },
                    onRestoreDefaults = {
                        val defaults = listOf(
                            OperatingScheduleItem("s1", "Segunda-feira", isOpen = false, openTime = "08:00", closeTime = "18:00"),
                            OperatingScheduleItem("s2", "Terça-feira", isOpen = true, openTime = "08:00", closeTime = "20:00"),
                            OperatingScheduleItem("s3", "Quarta-feira", isOpen = true, openTime = "08:00", closeTime = "20:00"),
                            OperatingScheduleItem("s4", "Quinta-feira", isOpen = true, openTime = "08:00", closeTime = "20:00"),
                            OperatingScheduleItem("s5", "Sexta-feira", isOpen = true, openTime = "08:00", closeTime = "20:00"),
                            OperatingScheduleItem("s6", "Sábado", isOpen = true, openTime = "08:00", closeTime = "20:00"),
                            OperatingScheduleItem("s7", "Domingo", isOpen = true, openTime = "07:00", closeTime = "12:00")
                        )
                        onUpdateOperatingSchedules(defaults)
                        android.widget.Toast.makeText(context, "Horários restaurados para o padrão do sistema!", android.widget.Toast.LENGTH_SHORT).show()
                    }
                )
                8 -> AdminSettingsTab(
                    settings = adminSettings,
                    onSaveSettings = { updated ->
                        onUpdateAdminSettings(updated)
                        android.widget.Toast.makeText(context, "Configurações salvas!", android.widget.Toast.LENGTH_SHORT).show()
                    }
                )
            }
        }
    }

    // Dialogs implementation for Admin Panel
    if (showNewBookingDialog) {
        AdminNewBookingDialog(
            barbers = teamBarbers,
            services = allServices,
            onDismiss = { showNewBookingDialog = false },
            onConfirm = { clientName, clientPhone, barberName, dateStr, timeStr, serviceList, price ->
                val code = generateClientCode()
                val newBooking = ConfirmedBooking(
                    id = java.util.UUID.randomUUID().toString(),
                    date = BarberDateOption("m-${System.currentTimeMillis()}", "HOJE", "07", "AGO", dateStr),
                    time = timeStr,
                    barber = barberName,
                    services = serviceList,
                    totalPrice = price,
                    clientCode = code,
                    clientName = clientName,
                    status = "Confirmado"
                )
                onUpdateBookings(listOf(newBooking) + confirmedBookings)
                showNewBookingDialog = false
                android.widget.Toast.makeText(context, "Agendamento criado! Código do cliente: $code", android.widget.Toast.LENGTH_LONG).show()
            }
        )
    }

    if (showNewClientDialog) {
        AdminNewClientDialog(
            onDismiss = { showNewClientDialog = false },
            onConfirm = { name, phone, email ->
                val newAccount = UserAccount(
                    fullName = name,
                    phone = phone,
                    email = if (email.isBlank()) null else email,
                    password = "123",
                    clientCode = generateClientCode()
                )
                onUpdateUsers(registeredUsers + newAccount)
                showNewClientDialog = false
                android.widget.Toast.makeText(context, "Cliente ${name} cadastrado (Código: ${newAccount.clientCode})", android.widget.Toast.LENGTH_LONG).show()
            }
        )
    }

    if (showNewBarberDialog) {
        AdminNewBarberDialog(
            onDismiss = { showNewBarberDialog = false },
            onConfirm = { name, role, phone ->
                val newBarber = TeamBarberItem(
                    id = "b-${System.currentTimeMillis()}",
                    name = name,
                    role = role,
                    phone = phone,
                    isActive = true,
                    completedAppointments = 0,
                    totalRevenue = 0.0
                )
                onUpdateTeamBarbers(teamBarbers + newBarber)
                showNewBarberDialog = false
                android.widget.Toast.makeText(context, "Barbeiro $name adicionado à equipe!", android.widget.Toast.LENGTH_SHORT).show()
            }
        )
    }

    if (showNewCouponDialog) {
        AdminNewCouponDialog(
            onDismiss = { showNewCouponDialog = false },
            onConfirm = { code, isPct, value, maxUses ->
                val newCoupon = CouponItem(
                    id = "c-${System.currentTimeMillis()}",
                    code = code.uppercase().trim(),
                    discountPercent = if (isPct) value.toInt() else 0,
                    discountFixed = if (!isPct) value else 0.0,
                    isPercentage = isPct,
                    maxUses = maxUses,
                    usesCount = 0,
                    isActive = true
                )
                onUpdateCoupons(couponsList + newCoupon)
                showNewCouponDialog = false
                android.widget.Toast.makeText(context, "Cupom ${newCoupon.code} criado e ativo!", android.widget.Toast.LENGTH_SHORT).show()
            }
        )
    }

    if (showNewPostDialog) {
        AdminNewPostDialog(
            barbers = teamBarbers,
            onDismiss = { showNewPostDialog = false },
            onConfirm = { title, desc, category, barber ->
                val newPost = FeedPostItem(
                    id = "p-${System.currentTimeMillis()}",
                    barberName = barber,
                    barberRole = "Barbeiro",
                    timeAgo = "Agora",
                    title = title,
                    description = desc,
                    styleBadge = category,
                    tags = listOf(category, "JadsonBarber"),
                    likeCount = 1,
                    isLiked = false
                )
                onUpdateFeedPosts(listOf(newPost) + feedPosts)
                showNewPostDialog = false
                android.widget.Toast.makeText(context, "Foto publicada no Feed do Aplicativo!", android.widget.Toast.LENGTH_SHORT).show()
            }
        )
    }
}

// ----------------------------------------------------------------------------
// TAB 0: DASHBOARD
// ----------------------------------------------------------------------------
@Composable
private fun AdminDashboardTab(
    bookings: List<ConfirmedBooking>,
    users: List<UserAccount>,
    barbers: List<TeamBarberItem>,
    onNewBooking: () -> Unit,
    onNewCoupon: () -> Unit,
    onTabSelect: (Int) -> Unit,
    onStatusChange: (String, String) -> Unit
) {
    val totalRevenue = bookings.sumOf { it.totalPrice }
    val activeBarbersCount = barbers.count { it.isActive }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Metric Cards Grid
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            AdminMetricCard(
                title = "FATURAMENTO TOTAL",
                value = String.format("R$ %.2f", totalRevenue),
                subtitle = "Sincronizado",
                icon = Icons.Default.AttachMoney,
                color = YellowGold,
                modifier = Modifier.weight(1f)
            )
            AdminMetricCard(
                title = "AGENDAMENTOS",
                value = "${bookings.size}",
                subtitle = "Totais no App",
                icon = Icons.Default.EventAvailable,
                color = Color(0xFF4FC3F7),
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            AdminMetricCard(
                title = "CLIENTES",
                value = "${users.size}",
                subtitle = "Cadastrados",
                icon = Icons.Default.People,
                color = Color(0xFF81C784),
                modifier = Modifier.weight(1f)
            )
            AdminMetricCard(
                title = "BARBEIROS ATIVOS",
                value = "$activeBarbersCount",
                subtitle = "Equipe",
                icon = Icons.Default.Group,
                color = Color(0xFFFFB74D),
                modifier = Modifier.weight(1f)
            )
        }

        // Quick Action Buttons
        Surface(
            color = CharcoalSurface,
            shape = RoundedCornerShape(16.dp),
            border = androidx.compose.foundation.BorderStroke(1.dp, CharcoalBorder),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(14.dp)) {
                Text(
                    text = "AÇÕES RÁPIDAS",
                    fontSize = 11.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = YellowGold,
                    letterSpacing = 1.sp
                )
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Button(
                        onClick = onNewBooking,
                        colors = ButtonDefaults.buttonColors(containerColor = YellowGold),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier.weight(1f)
                    ) {
                        Text("+ Agendamento", fontSize = 11.sp, fontWeight = FontWeight.Bold, color = TextBlack)
                    }
                    Button(
                        onClick = onNewCoupon,
                        colors = ButtonDefaults.buttonColors(containerColor = CharcoalCard),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier.weight(1f)
                    ) {
                        Text("+ Cupom", fontSize = 11.sp, fontWeight = FontWeight.Bold, color = YellowGold)
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Button(
                        onClick = { onTabSelect(3) }, // Clientes
                        colors = ButtonDefaults.buttonColors(containerColor = CharcoalCard),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier.weight(1f)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Default.People, contentDescription = null, tint = TextWhite, modifier = Modifier.size(14.dp))
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Clientes", fontSize = 11.sp, fontWeight = FontWeight.Bold, color = TextWhite)
                        }
                    }
                    Button(
                        onClick = { onTabSelect(7) }, // Horários
                        colors = ButtonDefaults.buttonColors(containerColor = CharcoalCard),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier.weight(1f)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Default.Schedule, contentDescription = null, tint = TextWhite, modifier = Modifier.size(14.dp))
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Horários", fontSize = 11.sp, fontWeight = FontWeight.Bold, color = TextWhite)
                        }
                    }
                }
            }
        }

        // Agendamentos em Tempo Real Section
        Text(
            text = "AGENDAMENTOS EM TEMPO REAL",
            fontSize = 12.sp,
            fontWeight = FontWeight.ExtraBold,
            color = YellowGold,
            letterSpacing = 1.sp
        )

        if (bookings.isEmpty()) {
            Surface(
                color = CharcoalSurface,
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(modifier = Modifier.padding(20.dp), contentAlignment = Alignment.Center) {
                    Text("Nenhum agendamento realizado até o momento.", color = TextGray, fontSize = 12.sp)
                }
            }
        } else {
            bookings.forEach { booking ->
                AdminBookingCardItem(
                    booking = booking,
                    onStatusChange = { newStatus -> onStatusChange(booking.id, newStatus) },
                    onDelete = null
                )
            }
        }
    }
}

// Helper Metric Card
@Composable
private fun AdminMetricCard(
    title: String,
    value: String,
    subtitle: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    color: Color,
    modifier: Modifier = Modifier
) {
    Surface(
        color = CharcoalSurface,
        shape = RoundedCornerShape(16.dp),
        border = androidx.compose.foundation.BorderStroke(1.dp, color.copy(alpha = 0.4f)),
        modifier = modifier
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(title, fontSize = 9.sp, fontWeight = FontWeight.ExtraBold, color = color)
                Icon(imageVector = icon, contentDescription = null, tint = color, modifier = Modifier.size(18.dp))
            }
            Spacer(modifier = Modifier.height(6.dp))
            Text(value, fontSize = 18.sp, fontWeight = FontWeight.ExtraBold, color = TextWhite)
            Text(subtitle, fontSize = 10.sp, color = TextGray)
        }
    }
}

// ----------------------------------------------------------------------------
// TAB 1: FINANCEIRO
// ----------------------------------------------------------------------------
@Composable
private fun AdminFinanceTab(
    bookings: List<ConfirmedBooking>,
    services: List<BarberService>,
    barbers: List<TeamBarberItem>
) {
    val totalRevenue = bookings.sumOf { it.totalPrice }
    val avgTicket = if (bookings.isNotEmpty()) totalRevenue / bookings.size else 0.0

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            AdminMetricCard(
                title = "RECEITA REALIZADA",
                value = String.format("R$ %.2f", totalRevenue),
                subtitle = "Total acumulado",
                icon = Icons.Default.TrendingUp,
                color = YellowGold,
                modifier = Modifier.weight(1f)
            )
            AdminMetricCard(
                title = "TICKET MÉDIO",
                value = String.format("R$ %.2f", avgTicket),
                subtitle = "Por atendimento",
                icon = Icons.Default.PointOfSale,
                color = Color(0xFF81C784),
                modifier = Modifier.weight(1f)
            )
        }

        // Formas de Pagamento Breakdown Card
        Surface(
            color = CharcoalSurface,
            shape = RoundedCornerShape(16.dp),
            border = androidx.compose.foundation.BorderStroke(1.dp, CharcoalBorder),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "FORMAS DE PAGAMENTO (ESTIMADO)",
                    fontSize = 11.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = YellowGold,
                    letterSpacing = 1.sp
                )
                Spacer(modifier = Modifier.height(12.dp))

                PaymentMethodBar(label = "PIX Direct / QrCode", percentage = 0.65f, amount = totalRevenue * 0.65, color = YellowGold)
                Spacer(modifier = Modifier.height(8.dp))
                PaymentMethodBar(label = "Cartão de Crédito / Débito", percentage = 0.25f, amount = totalRevenue * 0.25, color = Color(0xFF4FC3F7))
                Spacer(modifier = Modifier.height(8.dp))
                PaymentMethodBar(label = "Dinheiro Presencial", percentage = 0.10f, amount = totalRevenue * 0.10, color = Color(0xFFFFB74D))
            }
        }

        // Revenue per Barber Breakdown
        Surface(
            color = CharcoalSurface,
            shape = RoundedCornerShape(16.dp),
            border = androidx.compose.foundation.BorderStroke(1.dp, CharcoalBorder),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "FATURAMENTO POR BARBEIRO",
                    fontSize = 11.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = YellowGold,
                    letterSpacing = 1.sp
                )
                Spacer(modifier = Modifier.height(12.dp))

                barbers.forEach { barber ->
                    val barberBookings = bookings.filter { it.barber.contains(barber.name, ignoreCase = true) }
                    val barberRevenue = barberBookings.sumOf { it.totalPrice }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 6.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Text(barber.name, fontSize = 13.sp, fontWeight = FontWeight.Bold, color = TextWhite)
                            Text("${barberBookings.size} atendimentos", fontSize = 11.sp, color = TextGray)
                        }
                        Text(String.format("R$ %.2f", barberRevenue), fontSize = 14.sp, fontWeight = FontWeight.ExtraBold, color = YellowGold)
                    }
                    Box(modifier = Modifier.fillMaxWidth().height(0.5.dp).background(CharcoalBorder))
                }
            }
        }

        // Financial History List
        Text(
            text = "HISTÓRICO DE LANÇAMENTOS",
            fontSize = 12.sp,
            fontWeight = FontWeight.ExtraBold,
            color = YellowGold,
            letterSpacing = 1.sp
        )

        bookings.forEach { booking ->
            Surface(
                color = CharcoalSurface,
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(booking.clientName ?: "Cliente", fontSize = 13.sp, fontWeight = FontWeight.Bold, color = TextWhite)
                        Text("${booking.date.fullFormatted} às ${booking.time} • ${booking.barber}", fontSize = 11.sp, color = TextGray)
                    }
                    Text(String.format("R$ %.2f", booking.totalPrice), fontSize = 14.sp, fontWeight = FontWeight.ExtraBold, color = YellowGold)
                }
            }
        }
    }
}

@Composable
private fun PaymentMethodBar(label: String, percentage: Float, amount: Double, color: Color) {
    Column {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(label, fontSize = 11.sp, color = TextWhite)
            Text(String.format("R$ %.2f (%.0f%%)", amount, percentage * 100), fontSize = 11.sp, fontWeight = FontWeight.Bold, color = color)
        }
        Spacer(modifier = Modifier.height(4.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(6.dp)
                .clip(CircleShape)
                .background(CharcoalCard)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(percentage)
                    .background(color)
            )
        }
    }
}

// ----------------------------------------------------------------------------
// TAB 2: AGENDAMENTOS
// ----------------------------------------------------------------------------
@Composable
private fun AdminBookingsTab(
    bookings: List<ConfirmedBooking>,
    barbers: List<TeamBarberItem>,
    services: List<BarberService>,
    onNewBookingClick: () -> Unit,
    onStatusChange: (String, String) -> Unit,
    onDeleteBooking: (String) -> Unit
) {
    var statusFilter by remember { mutableStateOf("Todos") }
    var searchQuery by remember { mutableStateOf("") }

    val filteredBookings = bookings.filter { booking ->
        val matchesStatus = when (statusFilter) {
            "Confirmados" -> booking.status == "Confirmado"
            "Concluídos" -> booking.status == "Concluído"
            "Cancelados" -> booking.status == "Cancelado"
            else -> true
        }
        val matchesSearch = searchQuery.isBlank() ||
                (booking.clientName?.contains(searchQuery, ignoreCase = true) == true) ||
                (booking.clientCode?.contains(searchQuery, ignoreCase = true) == true) ||
                (booking.barber.contains(searchQuery, ignoreCase = true))

        matchesStatus && matchesSearch
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        Button(
            onClick = onNewBookingClick,
            colors = ButtonDefaults.buttonColors(containerColor = YellowGold),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null, tint = TextBlack)
                Spacer(modifier = Modifier.width(6.dp))
                Text("CRIAR NOVO AGENDAMENTO MANUAL", fontSize = 12.sp, fontWeight = FontWeight.ExtraBold, color = TextBlack)
            }
        }

        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            placeholder = { Text("Buscar por cliente, código (ex: 482K)...", color = TextGray, fontSize = 12.sp) },
            leadingIcon = { Icon(Icons.Default.Search, contentDescription = null, tint = YellowGold) },
            singleLine = true,
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = YellowGold,
                unfocusedBorderColor = CharcoalBorder,
                focusedContainerColor = CharcoalSurface,
                unfocusedContainerColor = CharcoalSurface,
                focusedTextColor = TextWhite,
                unfocusedTextColor = TextWhite
            ),
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp)
        )

        // Status Filter Chips
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            listOf("Todos", "Confirmados", "Concluídos", "Cancelados").forEach { status ->
                val isSelected = statusFilter == status
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(16.dp))
                        .background(if (isSelected) YellowGold else CharcoalSurface)
                        .clickable { statusFilter = status }
                        .padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    Text(
                        text = status,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (isSelected) TextBlack else TextWhite
                    )
                }
            }
        }

        if (filteredBookings.isEmpty()) {
            Surface(
                color = CharcoalSurface,
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(modifier = Modifier.padding(24.dp), contentAlignment = Alignment.Center) {
                    Text("Nenhum agendamento encontrado.", color = TextGray, fontSize = 12.sp)
                }
            }
        } else {
            filteredBookings.forEach { booking ->
                AdminBookingCardItem(
                    booking = booking,
                    onStatusChange = { newStatus -> onStatusChange(booking.id, newStatus) },
                    onDelete = { onDeleteBooking(booking.id) }
                )
            }
        }
    }
}

@Composable
private fun AdminBookingCardItem(
    booking: ConfirmedBooking,
    onStatusChange: (String) -> Unit,
    onDelete: (() -> Unit)?
) {
    val statusColor = when (booking.status) {
        "Concluído" -> Color(0xFF4CAF50)
        "Cancelado" -> Color(0xFFFF5252)
        else -> YellowGold
    }

    Surface(
        color = CharcoalSurface,
        shape = RoundedCornerShape(16.dp),
        border = androidx.compose.foundation.BorderStroke(1.dp, statusColor.copy(alpha = 0.5f)),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .background(statusColor.copy(alpha = 0.2f))
                            .border(1.dp, statusColor, RoundedCornerShape(6.dp))
                            .padding(horizontal = 8.dp, vertical = 3.dp)
                    ) {
                        Text(booking.status, fontSize = 10.sp, fontWeight = FontWeight.Bold, color = statusColor)
                    }
                    if (!booking.clientCode.isNullOrBlank()) {
                        Spacer(modifier = Modifier.width(8.dp))
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(6.dp))
                                .background(YellowGold.copy(alpha = 0.15f))
                                .padding(horizontal = 6.dp, vertical = 3.dp)
                        ) {
                            Text("Código: ${booking.clientCode}", fontSize = 10.sp, fontWeight = FontWeight.ExtraBold, color = YellowGold)
                        }
                    }
                }

                Text(String.format("R$ %.2f", booking.totalPrice), fontSize = 15.sp, fontWeight = FontWeight.ExtraBold, color = YellowGold)
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = booking.clientName ?: "Cliente da Barbearia",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = TextWhite
            )

            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Default.CalendarToday, contentDescription = null, tint = TextGray, modifier = Modifier.size(13.dp))
                Spacer(modifier = Modifier.width(4.dp))
                Text("${booking.date.fullFormatted} às ${booking.time}", fontSize = 11.sp, color = TextGray)
                Spacer(modifier = Modifier.width(8.dp))
                Text("•", fontSize = 11.sp, color = TextGray)
                Spacer(modifier = Modifier.width(8.dp))
                Icon(Icons.Default.ContentCut, contentDescription = null, tint = TextGray, modifier = Modifier.size(13.dp))
                Spacer(modifier = Modifier.width(4.dp))
                Text("Barbeiro: ${booking.barber}", fontSize = 11.sp, color = TextGray)
            }

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Serviços: " + booking.services.joinToString(", ") { it.title },
                fontSize = 11.sp,
                color = TextWhite.copy(alpha = 0.85f)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                if (booking.status != "Concluído") {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color(0xFF2E7D32))
                            .clickable { onStatusChange("Concluído") }
                            .padding(vertical = 6.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("Concluir", fontSize = 11.sp, fontWeight = FontWeight.Bold, color = Color.White)
                    }
                }
                if (booking.status != "Cancelado") {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color(0xFFC62828))
                            .clickable { onStatusChange("Cancelado") }
                            .padding(vertical = 6.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("Cancelar", fontSize = 11.sp, fontWeight = FontWeight.Bold, color = Color.White)
                    }
                }
                if (onDelete != null) {
                    IconButton(
                        onClick = onDelete,
                        modifier = Modifier
                            .size(30.dp)
                            .clip(CircleShape)
                            .background(CharcoalBg)
                    ) {
                        Icon(Icons.Default.Delete, contentDescription = "Remover", tint = Color(0xFFFF5252), modifier = Modifier.size(16.dp))
                    }
                }
            }
        }
    }
}

// ----------------------------------------------------------------------------
// TAB 3: CLIENTES
// ----------------------------------------------------------------------------
@Composable
private fun AdminClientsTab(
    users: List<UserAccount>,
    bookings: List<ConfirmedBooking>,
    onAddClientClick: () -> Unit
) {
    var searchQuery by remember { mutableStateOf("") }
    val context = androidx.compose.ui.platform.LocalContext.current

    val filteredUsers = users.filter { user ->
        searchQuery.isBlank() ||
                user.fullName.contains(searchQuery, ignoreCase = true) ||
                user.phone.contains(searchQuery) ||
                user.clientCode.contains(searchQuery, ignoreCase = true)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        Button(
            onClick = onAddClientClick,
            colors = ButtonDefaults.buttonColors(containerColor = YellowGold),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(imageVector = Icons.Default.PersonAdd, contentDescription = null, tint = TextBlack)
                Spacer(modifier = Modifier.width(6.dp))
                Text("CADASTRAR NOVO CLIENTE MANUALMENTE", fontSize = 12.sp, fontWeight = FontWeight.ExtraBold, color = TextBlack)
            }
        }

        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            placeholder = { Text("Buscar cliente por Nome, Telefone ou Código (ex: 482K)...", color = TextGray, fontSize = 12.sp) },
            leadingIcon = { Icon(Icons.Default.Search, contentDescription = null, tint = YellowGold) },
            singleLine = true,
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = YellowGold,
                unfocusedBorderColor = CharcoalBorder,
                focusedContainerColor = CharcoalSurface,
                unfocusedContainerColor = CharcoalSurface,
                focusedTextColor = TextWhite,
                unfocusedTextColor = TextWhite
            ),
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp)
        )

        filteredUsers.forEach { user ->
            val userBookings = bookings.filter { it.clientCode == user.clientCode }
            val totalSpent = userBookings.sumOf { it.totalPrice }

            Surface(
                color = CharcoalSurface,
                shape = RoundedCornerShape(16.dp),
                border = androidx.compose.foundation.BorderStroke(1.dp, CharcoalBorder),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(14.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(44.dp)
                                .clip(CircleShape)
                                .background(YellowGold.copy(alpha = 0.2f))
                                .border(1.dp, YellowGold, CircleShape),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = user.fullName.take(1).uppercase(),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = YellowGold
                            )
                        }

                        Column {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(user.fullName, fontSize = 14.sp, fontWeight = FontWeight.Bold, color = TextWhite)
                                Spacer(modifier = Modifier.width(6.dp))
                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(4.dp))
                                        .background(YellowGold)
                                        .padding(horizontal = 6.dp, vertical = 2.dp)
                                ) {
                                    Text(user.clientCode, fontSize = 10.sp, fontWeight = FontWeight.ExtraBold, color = TextBlack)
                                }
                            }
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(Icons.Default.Phone, contentDescription = null, tint = TextGray, modifier = Modifier.size(12.dp))
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(user.phone, fontSize = 11.sp, color = TextGray)
                            }
                            Text("Visitas: ${userBookings.size} • Total gasto: R$ ${String.format("%.2f", totalSpent)}", fontSize = 11.sp, color = YellowGold)
                        }
                    }

                    IconButton(
                        onClick = {
                            android.widget.Toast.makeText(context, "Abrindo WhatsApp para ${user.fullName}...", android.widget.Toast.LENGTH_SHORT).show()
                        },
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(Color(0xFF2E7D32))
                    ) {
                        Icon(Icons.Default.Phone, contentDescription = "WhatsApp", tint = Color.White, modifier = Modifier.size(18.dp))
                    }
                }
            }
        }
    }
}

// ----------------------------------------------------------------------------
// TAB 4: EQUIPE
// ----------------------------------------------------------------------------
@Composable
private fun AdminTeamTab(
    barbers: List<TeamBarberItem>,
    onAddBarberClick: () -> Unit,
    onToggleActive: (String) -> Unit,
    onDeleteBarber: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        Button(
            onClick = onAddBarberClick,
            colors = ButtonDefaults.buttonColors(containerColor = YellowGold),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null, tint = TextBlack)
                Spacer(modifier = Modifier.width(6.dp))
                Text("ADICIONAR NOVO BARBEIRO À EQUIPE", fontSize = 12.sp, fontWeight = FontWeight.ExtraBold, color = TextBlack)
            }
        }

        barbers.forEach { barber ->
            Surface(
                color = CharcoalSurface,
                shape = RoundedCornerShape(16.dp),
                border = androidx.compose.foundation.BorderStroke(1.dp, if (barber.isActive) YellowGold.copy(alpha = 0.6f) else CharcoalBorder),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(14.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(44.dp)
                                .clip(CircleShape)
                                .background(YellowGradient),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(Icons.Default.ContentCut, contentDescription = null, tint = TextBlack, modifier = Modifier.size(22.dp))
                        }

                        Column {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(barber.name, fontSize = 14.sp, fontWeight = FontWeight.Bold, color = TextWhite)
                                Spacer(modifier = Modifier.width(6.dp))
                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(4.dp))
                                        .background(if (barber.isActive) Color(0xFF4CAF50) else Color.Gray)
                                        .padding(horizontal = 6.dp, vertical = 2.dp)
                                ) {
                                    Text(
                                        text = if (barber.isActive) "Ativo" else "Em Pausa",
                                        fontSize = 9.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White
                                    )
                                }
                            }
                            Text(barber.role, fontSize = 11.sp, color = TextGray)
                            Text("${barber.completedAppointments} cortes • R$ ${String.format("%.2f", barber.totalRevenue)}", fontSize = 11.sp, color = YellowGold)
                        }
                    }

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Switch(
                            checked = barber.isActive,
                            onCheckedChange = { onToggleActive(barber.id) },
                            colors = SwitchDefaults.colors(
                                checkedThumbColor = TextBlack,
                                checkedTrackColor = YellowGold
                            )
                        )
                        IconButton(onClick = { onDeleteBarber(barber.id) }) {
                            Icon(Icons.Default.Delete, contentDescription = "Remover", tint = Color(0xFFFF5252), modifier = Modifier.size(18.dp))
                        }
                    }
                }
            }
        }
    }
}

// ----------------------------------------------------------------------------
// TAB 5: FEED
// ----------------------------------------------------------------------------
@Composable
private fun AdminFeedTab(
    feedPosts: List<FeedPostItem>,
    onAddPostClick: () -> Unit,
    onDeletePost: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        Button(
            onClick = onAddPostClick,
            colors = ButtonDefaults.buttonColors(containerColor = YellowGold),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null, tint = TextBlack)
                Spacer(modifier = Modifier.width(6.dp))
                Text("PUBLICAR NOVO CORTE NO FEED DO APP", fontSize = 12.sp, fontWeight = FontWeight.ExtraBold, color = TextBlack)
            }
        }

        feedPosts.forEach { post ->
            Surface(
                color = CharcoalSurface,
                shape = RoundedCornerShape(16.dp),
                border = androidx.compose.foundation.BorderStroke(1.dp, CharcoalBorder),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(6.dp))
                                    .background(YellowGold)
                                    .padding(horizontal = 8.dp, vertical = 2.dp)
                            ) {
                                Text(post.styleBadge, fontSize = 10.sp, fontWeight = FontWeight.ExtraBold, color = TextBlack)
                            }
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("Por ${post.barberName}", fontSize = 11.sp, color = TextGray)
                        }

                        IconButton(onClick = { onDeletePost(post.id) }) {
                            Icon(Icons.Default.Delete, contentDescription = "Excluir Post", tint = Color(0xFFFF5252), modifier = Modifier.size(18.dp))
                        }
                    }

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(post.title, fontSize = 14.sp, fontWeight = FontWeight.Bold, color = TextWhite)
                    Text(post.description, fontSize = 12.sp, color = TextGray)

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Default.Star, contentDescription = null, tint = YellowGold, modifier = Modifier.size(14.dp))
                        Spacer(modifier = Modifier.width(4.dp))
                        Text("${post.likeCount} curtidas no app", fontSize = 11.sp, color = YellowGold, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}

// ----------------------------------------------------------------------------
// TAB 6: CUPOM DE DESCONTO
// ----------------------------------------------------------------------------
@Composable
private fun AdminCouponsTab(
    coupons: List<CouponItem>,
    onAddCouponClick: () -> Unit,
    onToggleActive: (String) -> Unit,
    onDeleteCoupon: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        Button(
            onClick = onAddCouponClick,
            colors = ButtonDefaults.buttonColors(containerColor = YellowGold),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(imageVector = Icons.Default.LocalOffer, contentDescription = null, tint = TextBlack)
                Spacer(modifier = Modifier.width(6.dp))
                Text("CRIAR NOVO CUPOM DE DESCONTO", fontSize = 12.sp, fontWeight = FontWeight.ExtraBold, color = TextBlack)
            }
        }

        coupons.forEach { coupon ->
            val discountText = if (coupon.isPercentage) "${coupon.discountPercent}% OFF" else String.format("R$ %.2f OFF", coupon.discountFixed)

            Surface(
                color = CharcoalSurface,
                shape = RoundedCornerShape(16.dp),
                border = androidx.compose.foundation.BorderStroke(1.dp, if (coupon.isActive) YellowGold.copy(alpha = 0.6f) else CharcoalBorder),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(14.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(8.dp))
                                .background(YellowGold)
                                .padding(horizontal = 10.dp, vertical = 6.dp)
                        ) {
                            Text(coupon.code, fontSize = 13.sp, fontWeight = FontWeight.ExtraBold, color = TextBlack)
                        }

                        Column {
                            Text(discountText, fontSize = 14.sp, fontWeight = FontWeight.Bold, color = TextWhite)
                            Text("Usos: ${coupon.usesCount}/${coupon.maxUses}", fontSize = 11.sp, color = TextGray)
                        }
                    }

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Switch(
                            checked = coupon.isActive,
                            onCheckedChange = { onToggleActive(coupon.id) },
                            colors = SwitchDefaults.colors(
                                checkedThumbColor = TextBlack,
                                checkedTrackColor = YellowGold
                            )
                        )
                        IconButton(onClick = { onDeleteCoupon(coupon.id) }) {
                            Icon(Icons.Default.Delete, contentDescription = "Excluir Cupom", tint = Color(0xFFFF5252), modifier = Modifier.size(18.dp))
                        }
                    }
                }
            }
        }
    }
}

// ----------------------------------------------------------------------------
// TAB 7: HORÁRIOS
// ----------------------------------------------------------------------------
@Composable
private fun AdminScheduleTab(
    schedules: List<OperatingScheduleItem>,
    onScheduleUpdate: (List<OperatingScheduleItem>) -> Unit,
    onRestoreDefaults: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        // Schedule Rules Banner
        Surface(
            color = CharcoalSurface,
            shape = RoundedCornerShape(16.dp),
            border = androidx.compose.foundation.BorderStroke(1.dp, YellowGold.copy(alpha = 0.5f)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(14.dp)) {
                Text(
                    text = "HORÁRIO PADRÃO DO SISTEMA",
                    fontSize = 11.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = YellowGold,
                    letterSpacing = 1.sp
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "• Terça-feira a Sábado: 08:00 às 20:00\n• Domingo: 07:00 às 12:00\n• Segunda-feira: Fechado (Folga)",
                    fontSize = 12.sp,
                    color = TextWhite,
                    lineHeight = 18.sp
                )
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    onClick = onRestoreDefaults,
                    colors = ButtonDefaults.buttonColors(containerColor = CharcoalCard),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("RESTAURAR HORÁRIOS PADRÃO", fontSize = 11.sp, fontWeight = FontWeight.Bold, color = YellowGold)
                }
            }
        }

        Text(
            text = "CONFIGURAÇÃO DIA A DIA",
            fontSize = 12.sp,
            fontWeight = FontWeight.ExtraBold,
            color = YellowGold,
            letterSpacing = 1.sp
        )

        schedules.forEach { item ->
            var isOpen by remember(item.isOpen) { mutableStateOf(item.isOpen) }
            var openTime by remember(item.openTime) { mutableStateOf(item.openTime) }
            var closeTime by remember(item.closeTime) { mutableStateOf(item.closeTime) }

            Surface(
                color = CharcoalSurface,
                shape = RoundedCornerShape(16.dp),
                border = androidx.compose.foundation.BorderStroke(1.dp, CharcoalBorder),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(item.dayOfWeek, fontSize = 14.sp, fontWeight = FontWeight.Bold, color = TextWhite)
                            Spacer(modifier = Modifier.width(8.dp))
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(4.dp))
                                    .background(if (isOpen) Color(0xFF4CAF50) else Color(0xFFFF5252))
                                    .padding(horizontal = 6.dp, vertical = 2.dp)
                            ) {
                                Text(
                                    text = if (isOpen) "Aberto" else "Fechado",
                                    fontSize = 9.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                            }
                        }

                        Switch(
                            checked = isOpen,
                            onCheckedChange = { newIsOpen ->
                                isOpen = newIsOpen
                                val updatedList = schedules.map {
                                    if (it.id == item.id) it.copy(isOpen = newIsOpen, openTime = openTime, closeTime = closeTime) else it
                                }
                                onScheduleUpdate(updatedList)
                            },
                            colors = SwitchDefaults.colors(
                                checkedThumbColor = TextBlack,
                                checkedTrackColor = YellowGold
                            )
                        )
                    }

                    if (isOpen) {
                        Spacer(modifier = Modifier.height(10.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            OutlinedTextField(
                                value = openTime,
                                onValueChange = { newTime ->
                                    openTime = newTime
                                    val updatedList = schedules.map {
                                        if (it.id == item.id) it.copy(openTime = newTime) else it
                                    }
                                    onScheduleUpdate(updatedList)
                                },
                                label = { Text("Abertura", fontSize = 10.sp, color = TextGray) },
                                singleLine = true,
                                modifier = Modifier.weight(1f),
                                shape = RoundedCornerShape(10.dp),
                                colors = OutlinedTextFieldDefaults.colors(
                                    focusedBorderColor = YellowGold,
                                    unfocusedBorderColor = CharcoalBorder,
                                    focusedTextColor = TextWhite,
                                    unfocusedTextColor = TextWhite
                                )
                            )

                            OutlinedTextField(
                                value = closeTime,
                                onValueChange = { newTime ->
                                    closeTime = newTime
                                    val updatedList = schedules.map {
                                        if (it.id == item.id) it.copy(closeTime = newTime) else it
                                    }
                                    onScheduleUpdate(updatedList)
                                },
                                label = { Text("Fechamento", fontSize = 10.sp, color = TextGray) },
                                singleLine = true,
                                modifier = Modifier.weight(1f),
                                shape = RoundedCornerShape(10.dp),
                                colors = OutlinedTextFieldDefaults.colors(
                                    focusedBorderColor = YellowGold,
                                    unfocusedBorderColor = CharcoalBorder,
                                    focusedTextColor = TextWhite,
                                    unfocusedTextColor = TextWhite
                                )
                            )
                        }
                    }
                }
            }
        }
    }
}

// ----------------------------------------------------------------------------
// TAB 8: CONFIGURAÇÕES
// ----------------------------------------------------------------------------
@Composable
private fun AdminSettingsTab(
    settings: AdminSettings,
    onSaveSettings: (AdminSettings) -> Unit
) {
    var shopName by remember { mutableStateOf(settings.shopName) }
    var phone by remember { mutableStateOf(settings.phone) }
    var pixKey by remember { mutableStateOf(settings.pixKey) }
    var address by remember { mutableStateOf(settings.address) }
    var autoApprove by remember { mutableStateOf(settings.autoApproveBookings) }
    var adminPin by remember { mutableStateOf(settings.adminPin) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        OutlinedTextField(
            value = shopName,
            onValueChange = { shopName = it },
            label = { Text("Nome da Barbearia") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = YellowGold, unfocusedBorderColor = CharcoalBorder,
                focusedTextColor = TextWhite, unfocusedTextColor = TextWhite
            ),
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp)
        )

        OutlinedTextField(
            value = phone,
            onValueChange = { phone = it },
            label = { Text("Telefone / WhatsApp") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = YellowGold, unfocusedBorderColor = CharcoalBorder,
                focusedTextColor = TextWhite, unfocusedTextColor = TextWhite
            ),
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp)
        )

        OutlinedTextField(
            value = pixKey,
            onValueChange = { pixKey = it },
            label = { Text("Chave PIX Oficial") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = YellowGold, unfocusedBorderColor = CharcoalBorder,
                focusedTextColor = TextWhite, unfocusedTextColor = TextWhite
            ),
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp)
        )

        OutlinedTextField(
            value = address,
            onValueChange = { address = it },
            label = { Text("Endereço da Barbearia") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = YellowGold, unfocusedBorderColor = CharcoalBorder,
                focusedTextColor = TextWhite, unfocusedTextColor = TextWhite
            ),
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp)
        )

        Surface(
            color = CharcoalSurface,
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.padding(14.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text("Aprovação Automática", fontSize = 13.sp, fontWeight = FontWeight.Bold, color = TextWhite)
                    Text("Confirmar agendamentos do cliente na hora", fontSize = 11.sp, color = TextGray)
                }
                Switch(
                    checked = autoApprove,
                    onCheckedChange = { autoApprove = it },
                    colors = SwitchDefaults.colors(checkedThumbColor = TextBlack, checkedTrackColor = YellowGold)
                )
            }
        }

        OutlinedTextField(
            value = adminPin,
            onValueChange = { adminPin = it },
            label = { Text("PIN do Painel Admin") },
            singleLine = true,
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = YellowGold, unfocusedBorderColor = CharcoalBorder,
                focusedTextColor = TextWhite, unfocusedTextColor = TextWhite
            ),
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp)
        )

        Button(
            onClick = {
                onSaveSettings(
                    AdminSettings(
                        shopName = shopName,
                        phone = phone,
                        pixKey = pixKey,
                        address = address,
                        autoApproveBookings = autoApprove,
                        adminPin = adminPin
                    )
                )
            },
            colors = ButtonDefaults.buttonColors(containerColor = YellowGold),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("SALVAR CONFIGURAÇÕES DA BARBEARIA", fontSize = 12.sp, fontWeight = FontWeight.ExtraBold, color = TextBlack)
        }
    }
}

// ----------------------------------------------------------------------------
// DIALOGS FOR ADMIN PANEL
// ----------------------------------------------------------------------------
@Composable
private fun AdminNewBookingDialog(
    barbers: List<TeamBarberItem>,
    services: List<BarberService>,
    onDismiss: () -> Unit,
    onConfirm: (clientName: String, clientPhone: String, barberName: String, dateStr: String, timeStr: String, serviceList: List<BarberService>, price: Double) -> Unit
) {
    var clientName by remember { mutableStateOf("") }
    var clientPhone by remember { mutableStateOf("") }
    var selectedBarber by remember { mutableStateOf(barbers.firstOrNull()?.name ?: "Jadson Barber") }
    var selectedTime by remember { mutableStateOf("10:00") }
    var selectedDateStr by remember { mutableStateOf("Hoje") }
    var selectedServices by remember { mutableStateOf(listOf(services.first())) }

    Dialog(onDismissRequest = onDismiss) {
        Surface(
            color = CharcoalSurface,
            shape = RoundedCornerShape(20.dp),
            border = androidx.compose.foundation.BorderStroke(1.5.dp, YellowGold),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(20.dp)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text("NOVO AGENDAMENTO MANUAL", fontSize = 16.sp, fontWeight = FontWeight.ExtraBold, color = YellowGold)

                OutlinedTextField(
                    value = clientName,
                    onValueChange = { clientName = it },
                    label = { Text("Nome do Cliente") },
                    colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = YellowGold, unfocusedBorderColor = CharcoalBorder, focusedTextColor = TextWhite, unfocusedTextColor = TextWhite),
                    modifier = Modifier.fillMaxWidth()
                )

                OutlinedTextField(
                    value = clientPhone,
                    onValueChange = { clientPhone = it },
                    label = { Text("Telefone / WhatsApp") },
                    colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = YellowGold, unfocusedBorderColor = CharcoalBorder, focusedTextColor = TextWhite, unfocusedTextColor = TextWhite),
                    modifier = Modifier.fillMaxWidth()
                )

                Text("SELECIONE O BARBEIRO:", fontSize = 11.sp, fontWeight = FontWeight.Bold, color = YellowGold)
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    barbers.forEach { barber ->
                        val isSel = selectedBarber == barber.name
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .background(if (isSel) YellowGold else CharcoalCard)
                                .clickable { selectedBarber = barber.name }
                                .padding(horizontal = 10.dp, vertical = 6.dp)
                        ) {
                            Text(barber.name, fontSize = 11.sp, fontWeight = FontWeight.Bold, color = if (isSel) TextBlack else TextWhite)
                        }
                    }
                }

                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    OutlinedTextField(
                        value = selectedDateStr,
                        onValueChange = { selectedDateStr = it },
                        label = { Text("Data") },
                        modifier = Modifier.weight(1f),
                        colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = YellowGold, unfocusedBorderColor = CharcoalBorder, focusedTextColor = TextWhite, unfocusedTextColor = TextWhite)
                    )
                    OutlinedTextField(
                        value = selectedTime,
                        onValueChange = { selectedTime = it },
                        label = { Text("Horário") },
                        modifier = Modifier.weight(1f),
                        colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = YellowGold, unfocusedBorderColor = CharcoalBorder, focusedTextColor = TextWhite, unfocusedTextColor = TextWhite)
                    )
                }

                val totalPrice = selectedServices.sumOf { it.price }
                Text("Total: R$ ${String.format("%.2f", totalPrice)}", fontSize = 14.sp, fontWeight = FontWeight.ExtraBold, color = YellowGold)

                Button(
                    onClick = {
                        if (clientName.isNotBlank()) {
                            onConfirm(clientName, clientPhone, selectedBarber, selectedDateStr, selectedTime, selectedServices, totalPrice)
                        }
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = YellowGold),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("CONFIRMAR AGENDAMENTO", fontSize = 12.sp, fontWeight = FontWeight.ExtraBold, color = TextBlack)
                }
            }
        }
    }
}

@Composable
private fun AdminNewClientDialog(
    onDismiss: () -> Unit,
    onConfirm: (name: String, phone: String, email: String) -> Unit
) {
    var name by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    Dialog(onDismissRequest = onDismiss) {
        Surface(
            color = CharcoalSurface,
            shape = RoundedCornerShape(20.dp),
            border = androidx.compose.foundation.BorderStroke(1.5.dp, YellowGold),
            modifier = Modifier.padding(16.dp)
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text("CADASTRAR CLIENTE", fontSize = 16.sp, fontWeight = FontWeight.ExtraBold, color = YellowGold)

                OutlinedTextField(
                    value = name, onValueChange = { name = it }, label = { Text("Nome Completo") },
                    colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = YellowGold, unfocusedBorderColor = CharcoalBorder, focusedTextColor = TextWhite, unfocusedTextColor = TextWhite),
                    modifier = Modifier.fillMaxWidth()
                )

                OutlinedTextField(
                    value = phone, onValueChange = { phone = it }, label = { Text("Telefone / WhatsApp") },
                    colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = YellowGold, unfocusedBorderColor = CharcoalBorder, focusedTextColor = TextWhite, unfocusedTextColor = TextWhite),
                    modifier = Modifier.fillMaxWidth()
                )

                OutlinedTextField(
                    value = email, onValueChange = { email = it }, label = { Text("E-mail (Opcional)") },
                    colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = YellowGold, unfocusedBorderColor = CharcoalBorder, focusedTextColor = TextWhite, unfocusedTextColor = TextWhite),
                    modifier = Modifier.fillMaxWidth()
                )

                Button(
                    onClick = { if (name.isNotBlank() && phone.isNotBlank()) onConfirm(name, phone, email) },
                    colors = ButtonDefaults.buttonColors(containerColor = YellowGold),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("SALVAR E GERAR CÓDIGO", fontSize = 12.sp, fontWeight = FontWeight.ExtraBold, color = TextBlack)
                }
            }
        }
    }
}

@Composable
private fun AdminNewBarberDialog(
    onDismiss: () -> Unit,
    onConfirm: (name: String, role: String, phone: String) -> Unit
) {
    var name by remember { mutableStateOf("") }
    var role by remember { mutableStateOf("Barbeiro") }
    var phone by remember { mutableStateOf("") }

    Dialog(onDismissRequest = onDismiss) {
        Surface(
            color = CharcoalSurface,
            shape = RoundedCornerShape(20.dp),
            border = androidx.compose.foundation.BorderStroke(1.5.dp, YellowGold),
            modifier = Modifier.padding(16.dp)
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text("ADICIONAR BARBEIRO", fontSize = 16.sp, fontWeight = FontWeight.ExtraBold, color = YellowGold)

                OutlinedTextField(
                    value = name, onValueChange = { name = it }, label = { Text("Nome do Barbeiro") },
                    colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = YellowGold, unfocusedBorderColor = CharcoalBorder, focusedTextColor = TextWhite, unfocusedTextColor = TextWhite),
                    modifier = Modifier.fillMaxWidth()
                )

                OutlinedTextField(
                    value = role, onValueChange = { role = it }, label = { Text("Especialidade / Cargo") },
                    colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = YellowGold, unfocusedBorderColor = CharcoalBorder, focusedTextColor = TextWhite, unfocusedTextColor = TextWhite),
                    modifier = Modifier.fillMaxWidth()
                )

                OutlinedTextField(
                    value = phone, onValueChange = { phone = it }, label = { Text("Telefone / WhatsApp") },
                    colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = YellowGold, unfocusedBorderColor = CharcoalBorder, focusedTextColor = TextWhite, unfocusedTextColor = TextWhite),
                    modifier = Modifier.fillMaxWidth()
                )

                Button(
                    onClick = { if (name.isNotBlank()) onConfirm(name, role, phone) },
                    colors = ButtonDefaults.buttonColors(containerColor = YellowGold),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("CADASTRAR BARBEIRO", fontSize = 12.sp, fontWeight = FontWeight.ExtraBold, color = TextBlack)
                }
            }
        }
    }
}

@Composable
private fun AdminNewCouponDialog(
    onDismiss: () -> Unit,
    onConfirm: (code: String, isPct: Boolean, value: Double, maxUses: Int) -> Unit
) {
    var code by remember { mutableStateOf("") }
    var isPct by remember { mutableStateOf(true) }
    var valueStr by remember { mutableStateOf("10") }
    var maxUsesStr by remember { mutableStateOf("50") }

    Dialog(onDismissRequest = onDismiss) {
        Surface(
            color = CharcoalSurface,
            shape = RoundedCornerShape(20.dp),
            border = androidx.compose.foundation.BorderStroke(1.5.dp, YellowGold),
            modifier = Modifier.padding(16.dp)
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text("CRIAR CUPOM DE DESCONTO", fontSize = 16.sp, fontWeight = FontWeight.ExtraBold, color = YellowGold)

                OutlinedTextField(
                    value = code, onValueChange = { code = it }, label = { Text("Código do Cupom (ex: JADSON10)") },
                    colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = YellowGold, unfocusedBorderColor = CharcoalBorder, focusedTextColor = TextWhite, unfocusedTextColor = TextWhite),
                    modifier = Modifier.fillMaxWidth()
                )

                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(8.dp))
                            .background(if (isPct) YellowGold else CharcoalCard)
                            .clickable { isPct = true }
                            .padding(vertical = 8.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("Porcentagem (%)", fontSize = 11.sp, fontWeight = FontWeight.Bold, color = if (isPct) TextBlack else TextWhite)
                    }

                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(8.dp))
                            .background(if (!isPct) YellowGold else CharcoalCard)
                            .clickable { isPct = false }
                            .padding(vertical = 8.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("Valor Fixo (R$)", fontSize = 11.sp, fontWeight = FontWeight.Bold, color = if (!isPct) TextBlack else TextWhite)
                    }
                }

                OutlinedTextField(
                    value = valueStr, onValueChange = { valueStr = it }, label = { Text(if (isPct) "Valor em Porcentagem (%)" else "Valor Fixo (R$)") },
                    colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = YellowGold, unfocusedBorderColor = CharcoalBorder, focusedTextColor = TextWhite, unfocusedTextColor = TextWhite),
                    modifier = Modifier.fillMaxWidth()
                )

                OutlinedTextField(
                    value = maxUsesStr, onValueChange = { maxUsesStr = it }, label = { Text("Quantidade Máxima de Usos") },
                    colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = YellowGold, unfocusedBorderColor = CharcoalBorder, focusedTextColor = TextWhite, unfocusedTextColor = TextWhite),
                    modifier = Modifier.fillMaxWidth()
                )

                Button(
                    onClick = {
                        val valDouble = valueStr.toDoubleOrNull() ?: 10.0
                        val usesInt = maxUsesStr.toIntOrNull() ?: 50
                        if (code.isNotBlank()) onConfirm(code, isPct, valDouble, usesInt)
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = YellowGold),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("CRIAR E ATIVAR CUPOM", fontSize = 12.sp, fontWeight = FontWeight.ExtraBold, color = TextBlack)
                }
            }
        }
    }
}

@Composable
private fun AdminNewPostDialog(
    barbers: List<TeamBarberItem>,
    onDismiss: () -> Unit,
    onConfirm: (title: String, desc: String, category: String, barberName: String) -> Unit
) {
    var title by remember { mutableStateOf("") }
    var desc by remember { mutableStateOf("") }
    var category by remember { mutableStateOf("Degradê") }
    var selectedBarber by remember { mutableStateOf(barbers.firstOrNull()?.name ?: "Jadson Barber") }

    Dialog(onDismissRequest = onDismiss) {
        Surface(
            color = CharcoalSurface,
            shape = RoundedCornerShape(20.dp),
            border = androidx.compose.foundation.BorderStroke(1.5.dp, YellowGold),
            modifier = Modifier.padding(16.dp)
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text("PUBLICAR NO FEED DO APP", fontSize = 16.sp, fontWeight = FontWeight.ExtraBold, color = YellowGold)

                OutlinedTextField(
                    value = title, onValueChange = { title = it }, label = { Text("Título da Foto / Estilo") },
                    colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = YellowGold, unfocusedBorderColor = CharcoalBorder, focusedTextColor = TextWhite, unfocusedTextColor = TextWhite),
                    modifier = Modifier.fillMaxWidth()
                )

                OutlinedTextField(
                    value = desc, onValueChange = { desc = it }, label = { Text("Descrição do Corte e Técnica") },
                    colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = YellowGold, unfocusedBorderColor = CharcoalBorder, focusedTextColor = TextWhite, unfocusedTextColor = TextWhite),
                    modifier = Modifier.fillMaxWidth()
                )

                OutlinedTextField(
                    value = category, onValueChange = { category = it }, label = { Text("Categoria (ex: Degradê, Barba, Pigmentação)") },
                    colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = YellowGold, unfocusedBorderColor = CharcoalBorder, focusedTextColor = TextWhite, unfocusedTextColor = TextWhite),
                    modifier = Modifier.fillMaxWidth()
                )

                Button(
                    onClick = { if (title.isNotBlank()) onConfirm(title, desc, category, selectedBarber) },
                    colors = ButtonDefaults.buttonColors(containerColor = YellowGold),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("PUBLICAR NO FEED CLIENTE", fontSize = 12.sp, fontWeight = FontWeight.ExtraBold, color = TextBlack)
                }
            }
        }
    }
}

